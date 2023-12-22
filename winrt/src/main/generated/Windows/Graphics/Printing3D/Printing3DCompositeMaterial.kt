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

@ABIMarker(Printing3DCompositeMaterial.ABI::class)
@Signature("rc(Windows.Graphics.Printing3D.Printing3DCompositeMaterial;{462238dd-562e-4f6c-882d-f4d841fd63c7})")
@WinRTByReference(brClass = Printing3DCompositeMaterial.ByReference::class)
public class Printing3DCompositeMaterial(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrinting3DCompositeMaterial.WithDefault, IWinRTObject {
  private val __358647197_Interface: IPrinting3DCompositeMaterial.WithDefault by lazy {
    as_358647197()
  }


  public override val __358647197_Ptr: JNAPointer? by lazy {
    __358647197_Interface.__358647197_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__358647197_Interface)

  public constructor() : this(ABI.activate())

  private fun as_358647197(): IPrinting3DCompositeMaterial.WithDefault {
    if(pointer == NULL) {
      return(IPrinting3DCompositeMaterial.ABI.makeIPrinting3DCompositeMaterial(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrinting3DCompositeMaterial>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrinting3DCompositeMaterial.ABI.makeIPrinting3DCompositeMaterial(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<Printing3DCompositeMaterial> {
    public override fun getValue() = Printing3DCompositeMaterial(pointer.getPointer(0))

    public fun setValue(value: Printing3DCompositeMaterial): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Printing3DCompositeMaterial, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Printing3D.Printing3DCompositeMaterial".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): Printing3DCompositeMaterial {
      val address = segment.toRawLongValue()
      return Printing3DCompositeMaterial(Pointer(address))
    }

    public override fun toNative(obj: Printing3DCompositeMaterial): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
