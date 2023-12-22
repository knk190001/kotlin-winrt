package Microsoft.UI.Xaml

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

@ABIMarker(VisualStateGroup.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.VisualStateGroup;{8dfd691b-710c-5d6d-b71a-7a7f5ed54ac7})")
@WinRTByReference(brClass = VisualStateGroup.ByReference::class)
public class VisualStateGroup(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IVisualStateGroup.WithDefault, IWinRTObject {
  private val __2104552939_Interface: IVisualStateGroup.WithDefault by lazy {
    as_2104552939()
  }


  public override val __2104552939_Ptr: JNAPointer? by lazy {
    __2104552939_Interface.__2104552939_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2104552939_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2104552939(): IVisualStateGroup.WithDefault {
    if(pointer == NULL) {
      return(IVisualStateGroup.ABI.makeIVisualStateGroup(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVisualStateGroup>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVisualStateGroup.ABI.makeIVisualStateGroup(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VisualStateGroup> {
    public override fun getValue() = VisualStateGroup(pointer.getPointer(0))

    public fun setValue(value: VisualStateGroup): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VisualStateGroup, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.VisualStateGroup".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): VisualStateGroup {
      val address = segment.toRawLongValue()
      return VisualStateGroup(Pointer(address))
    }

    public override fun toNative(obj: VisualStateGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
