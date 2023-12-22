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

@ABIMarker(Printing3DTexture2CoordMaterial.ABI::class)
@Signature("rc(Windows.Graphics.Printing3D.Printing3DTexture2CoordMaterial;{8d844bfb-07e9-4986-9833-8dd3d48c6859})")
@WinRTByReference(brClass = Printing3DTexture2CoordMaterial.ByReference::class)
public class Printing3DTexture2CoordMaterial(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrinting3DTexture2CoordMaterial.WithDefault, IWinRTObject {
  private val __1205132116_Interface: IPrinting3DTexture2CoordMaterial.WithDefault by lazy {
    as_1205132116()
  }


  public override val __1205132116_Ptr: JNAPointer? by lazy {
    __1205132116_Interface.__1205132116_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1205132116_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1205132116(): IPrinting3DTexture2CoordMaterial.WithDefault {
    if(pointer == NULL) {
      return(IPrinting3DTexture2CoordMaterial.ABI.makeIPrinting3DTexture2CoordMaterial(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrinting3DTexture2CoordMaterial>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrinting3DTexture2CoordMaterial.ABI.makeIPrinting3DTexture2CoordMaterial(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<Printing3DTexture2CoordMaterial> {
    public override fun getValue() = Printing3DTexture2CoordMaterial(pointer.getPointer(0))

    public fun setValue(value: Printing3DTexture2CoordMaterial): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Printing3DTexture2CoordMaterial, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Printing3D.Printing3DTexture2CoordMaterial".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): Printing3DTexture2CoordMaterial {
      val address = segment.toRawLongValue()
      return Printing3DTexture2CoordMaterial(Pointer(address))
    }

    public override fun toNative(obj: Printing3DTexture2CoordMaterial): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
