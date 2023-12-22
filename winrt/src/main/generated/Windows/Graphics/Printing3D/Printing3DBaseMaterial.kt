package Windows.Graphics.Printing3D

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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(Printing3DBaseMaterial.ABI::class)
@Signature("rc(Windows.Graphics.Printing3D.Printing3DBaseMaterial;{d0f0e743-c50c-4bcb-9d04-fc16adcea2c9})")
@WinRTByReference(brClass = Printing3DBaseMaterial.ByReference::class)
public class Printing3DBaseMaterial(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrinting3DBaseMaterial.WithDefault, IWinRTObject {
  private val __2000148247_Interface: IPrinting3DBaseMaterial.WithDefault by lazy {
    as_2000148247()
  }


  public override val __2000148247_Ptr: JNAPointer? by lazy {
    __2000148247_Interface.__2000148247_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2000148247_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2000148247(): IPrinting3DBaseMaterial.WithDefault {
    if(pointer == NULL) {
      return(IPrinting3DBaseMaterial.ABI.makeIPrinting3DBaseMaterial(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrinting3DBaseMaterial>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrinting3DBaseMaterial.ABI.makeIPrinting3DBaseMaterial(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<Printing3DBaseMaterial> {
    public override fun getValue() = Printing3DBaseMaterial(pointer.getPointer(0))

    public fun setValue(value: Printing3DBaseMaterial): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Printing3DBaseMaterial, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IPrinting3DBaseMaterialStatics_Instance: IPrinting3DBaseMaterialStatics by lazy {
      createIPrinting3DBaseMaterialStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Printing3D.Printing3DBaseMaterial".toHandle(),
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

    public fun createIPrinting3DBaseMaterialStatics(): IPrinting3DBaseMaterialStatics {
      val refiid = Guid.REFIID(IPrinting3DBaseMaterialStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Printing3D.Printing3DBaseMaterial".toHandle(),refiid,interfacePtr)
      val result =
          IPrinting3DBaseMaterialStatics.ABI.makeIPrinting3DBaseMaterialStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Printing3DBaseMaterial {
      val address = segment.toRawLongValue()
      return Printing3DBaseMaterial(Pointer(address))
    }

    public override fun toNative(obj: Printing3DBaseMaterial): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Abs() = ABI.IPrinting3DBaseMaterialStatics_Instance.get_Abs()

    public fun get_Pla() = ABI.IPrinting3DBaseMaterialStatics_Instance.get_Pla()
  }
}
