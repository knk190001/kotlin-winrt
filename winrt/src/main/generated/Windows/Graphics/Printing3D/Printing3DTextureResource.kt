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

@ABIMarker(Printing3DTextureResource.ABI::class)
@Signature("rc(Windows.Graphics.Printing3D.Printing3DTextureResource;{a70df32d-6ab1-44ae-bc45-a27382c0d38c})")
@WinRTByReference(brClass = Printing3DTextureResource.ByReference::class)
public class Printing3DTextureResource(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrinting3DTextureResource.WithDefault, IWinRTObject {
  private val __491037992_Interface: IPrinting3DTextureResource.WithDefault by lazy {
    as_491037992()
  }


  public override val __491037992_Ptr: JNAPointer? by lazy {
    __491037992_Interface.__491037992_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__491037992_Interface)

  public constructor() : this(ABI.activate())

  private fun as_491037992(): IPrinting3DTextureResource.WithDefault {
    if(pointer == NULL) {
      return(IPrinting3DTextureResource.ABI.makeIPrinting3DTextureResource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrinting3DTextureResource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrinting3DTextureResource.ABI.makeIPrinting3DTextureResource(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<Printing3DTextureResource> {
    public override fun getValue() = Printing3DTextureResource(pointer.getPointer(0))

    public fun setValue(value: Printing3DTextureResource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Printing3DTextureResource, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Printing3D.Printing3DTextureResource".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): Printing3DTextureResource {
      val address = segment.toRawLongValue()
      return Printing3DTextureResource(Pointer(address))
    }

    public override fun toNative(obj: Printing3DTextureResource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
