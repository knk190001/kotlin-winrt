package Windows.Graphics.Printing3D

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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(Printing3DComponent.ABI::class)
@Signature("rc(Windows.Graphics.Printing3D.Printing3DComponent;{7e287845-bf7f-4cdb-a27f-30a01437fede})")
@WinRTByReference(brClass = Printing3DComponent.ByReference::class)
public class Printing3DComponent(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrinting3DComponent.WithDefault, IWinRTObject {
  private val __297460532_Interface: IPrinting3DComponent.WithDefault by lazy {
    as_297460532()
  }


  public override val __297460532_Ptr: JNAPointer? by lazy {
    __297460532_Interface.__297460532_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__297460532_Interface)

  public constructor() : this(ABI.activate())

  private fun as_297460532(): IPrinting3DComponent.WithDefault {
    if(pointer == NULL) {
      return(IPrinting3DComponent.ABI.makeIPrinting3DComponent(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrinting3DComponent>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrinting3DComponent.ABI.makeIPrinting3DComponent(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<Printing3DComponent> {
    public override fun getValue() = Printing3DComponent(pointer.getPointer(0))

    public fun setValue(value: Printing3DComponent): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Printing3DComponent, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Printing3D.Printing3DComponent".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): Printing3DComponent {
      val address = segment.toRawLongValue()
      return Printing3DComponent(Pointer(address))
    }

    public override fun toNative(obj: Printing3DComponent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
