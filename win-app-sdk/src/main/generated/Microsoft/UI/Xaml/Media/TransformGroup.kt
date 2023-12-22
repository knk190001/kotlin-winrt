package Microsoft.UI.Xaml.Media

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(TransformGroup.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.TransformGroup;{17c55f3b-899c-588f-8bd4-40fa3a5fcb04})")
@WinRTByReference(brClass = TransformGroup.ByReference::class)
public class TransformGroup(
  ptr: JNAPointer? = NULL
) : Transform(ptr), ITransformGroup.WithDefault, IWinRTObject {
  private val __1945817884_Interface: ITransformGroup.WithDefault by lazy {
    as_1945817884()
  }


  public override val __1945817884_Ptr: JNAPointer? by lazy {
    __1945817884_Interface.__1945817884_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1945817884_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1945817884(): ITransformGroup.WithDefault {
    if(pointer == NULL) {
      return(ITransformGroup.ABI.makeITransformGroup(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITransformGroup>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITransformGroup.ABI.makeITransformGroup(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<TransformGroup>
      {
    public override fun getValue() = TransformGroup(pointer.getPointer(0))

    public fun setValue(value: TransformGroup): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TransformGroup, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ITransformGroupStatics_Instance: ITransformGroupStatics by lazy {
      createITransformGroupStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.TransformGroup".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createITransformGroupStatics(): ITransformGroupStatics {
      val refiid = Guid.REFIID(ITransformGroupStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.TransformGroup".toHandle(),refiid,interfacePtr)
      val result = ITransformGroupStatics.ABI.makeITransformGroupStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): TransformGroup {
      val address = segment.toRawLongValue()
      return TransformGroup(Pointer(address))
    }

    public override fun toNative(obj: TransformGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ChildrenProperty() = ABI.ITransformGroupStatics_Instance.get_ChildrenProperty()
  }
}
