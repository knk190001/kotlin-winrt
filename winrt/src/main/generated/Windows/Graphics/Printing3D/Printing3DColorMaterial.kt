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

@ABIMarker(Printing3DColorMaterial.ABI::class)
@Signature("rc(Windows.Graphics.Printing3D.Printing3DColorMaterial;{e1899928-7ce7-4285-a35d-f145c9510c7b})")
@WinRTByReference(brClass = Printing3DColorMaterial.ByReference::class)
public class Printing3DColorMaterial(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrinting3DColorMaterial.WithDefault, IPrinting3DColorMaterial2.WithDefault,
    IWinRTObject {
  private val __550476295_Interface: IPrinting3DColorMaterial.WithDefault by lazy {
    as_550476295()
  }


  private val __115104089_Interface: IPrinting3DColorMaterial2.WithDefault by lazy {
    as_115104089()
  }


  public override val __550476295_Ptr: JNAPointer? by lazy {
    __550476295_Interface.__550476295_Ptr
  }


  public override val __115104089_Ptr: JNAPointer? by lazy {
    __115104089_Interface.__115104089_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__550476295_Interface, __115104089_Interface)

  public constructor() : this(ABI.activate())

  private fun as_550476295(): IPrinting3DColorMaterial.WithDefault {
    if(pointer == NULL) {
      return(IPrinting3DColorMaterial.ABI.makeIPrinting3DColorMaterial(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrinting3DColorMaterial>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrinting3DColorMaterial.ABI.makeIPrinting3DColorMaterial(ref.value))
  }

  private fun as_115104089(): IPrinting3DColorMaterial2.WithDefault {
    if(pointer == NULL) {
      return(IPrinting3DColorMaterial2.ABI.makeIPrinting3DColorMaterial2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrinting3DColorMaterial2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrinting3DColorMaterial2.ABI.makeIPrinting3DColorMaterial2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<Printing3DColorMaterial> {
    public override fun getValue() = Printing3DColorMaterial(pointer.getPointer(0))

    public fun setValue(value: Printing3DColorMaterial): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Printing3DColorMaterial, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Printing3D.Printing3DColorMaterial".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): Printing3DColorMaterial {
      val address = segment.toRawLongValue()
      return Printing3DColorMaterial(Pointer(address))
    }

    public override fun toNative(obj: Printing3DColorMaterial): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
