package Windows.Graphics.Imaging

import Windows.Foundation.IClosable
import Windows.Graphics.DirectX.Direct3D11.IDirect3DSurface
import Windows.Graphics.Imaging.ISoftwareBitmapFactory.ABI.IID
import Windows.Storage.Streams.IBuffer
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SoftwareBitmap.ABI::class)
@Signature("rc(Windows.Graphics.Imaging.SoftwareBitmap;{689e0708-7eef-483f-963f-da938818e073})")
@WinRTByReference(brClass = SoftwareBitmap.ByReference::class)
public class SoftwareBitmap(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISoftwareBitmap.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __1342539583_Interface: ISoftwareBitmap.WithDefault by lazy {
    as_1342539583()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1342539583_Ptr: JNAPointer? by lazy {
    __1342539583_Interface.__1342539583_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1342539583_Interface, __1260617006_Interface)

  public constructor(
    format: BitmapPixelFormat,
    width: Int,
    height: Int
  ) : this(ABI.activate(format, width, height))

  public constructor(
    format: BitmapPixelFormat,
    width: Int,
    height: Int,
    alpha: BitmapAlphaMode
  ) : this(ABI.activate(format, width, height, alpha))

  private fun as_1342539583(): ISoftwareBitmap.WithDefault {
    if(pointer == NULL) {
      return(ISoftwareBitmap.ABI.makeISoftwareBitmap(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISoftwareBitmap>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISoftwareBitmap.ABI.makeISoftwareBitmap(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SoftwareBitmap>
      {
    public override fun getValue() = SoftwareBitmap(pointer.getPointer(0))

    public fun setValue(value: SoftwareBitmap): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SoftwareBitmap, MemoryAddress> {
    public val ISoftwareBitmapStatics_Instance: ISoftwareBitmapStatics by lazy {
      createISoftwareBitmapStatics()
    }


    public val ISoftwareBitmapFactory_Instance: ISoftwareBitmapFactory by lazy {
      createISoftwareBitmapFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISoftwareBitmapStatics(): ISoftwareBitmapStatics {
      val refiid = Guid.REFIID(ISoftwareBitmapStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Imaging.SoftwareBitmap".toHandle(),refiid,interfacePtr)
      val result = ISoftwareBitmapStatics.ABI.makeISoftwareBitmapStatics(interfacePtr.value)
      return result
    }

    public fun createISoftwareBitmapFactory(): ISoftwareBitmapFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Imaging.SoftwareBitmap".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISoftwareBitmapFactory.ABI.makeISoftwareBitmapFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      format: BitmapPixelFormat,
      width: Int,
      height: Int
    ): JNAPointer? = ISoftwareBitmapFactory_Instance.Create(format, width, height)?.pointer

    public fun activate(
      format: BitmapPixelFormat,
      width: Int,
      height: Int,
      alpha: BitmapAlphaMode
    ): JNAPointer? = ISoftwareBitmapFactory_Instance.CreateWithAlpha(format, width, height,
        alpha)?.pointer

    public override fun fromNative(segment: MemoryAddress): SoftwareBitmap {
      val address = segment.toRawLongValue()
      return SoftwareBitmap(Pointer(address))
    }

    public override fun toNative(obj: SoftwareBitmap): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Copy(source: SoftwareBitmap) = ABI.ISoftwareBitmapStatics_Instance.Copy(source)

    public fun Convert(source: SoftwareBitmap, format: BitmapPixelFormat) =
        ABI.ISoftwareBitmapStatics_Instance.Convert(source, format)

    public fun Convert(
      source: SoftwareBitmap,
      format: BitmapPixelFormat,
      alpha: BitmapAlphaMode
    ) = ABI.ISoftwareBitmapStatics_Instance.Convert(source, format, alpha)

    public fun CreateCopyFromBuffer(
      source: IBuffer,
      format: BitmapPixelFormat,
      width: Int,
      height: Int
    ) = ABI.ISoftwareBitmapStatics_Instance.CreateCopyFromBuffer(source, format, width, height)

    public fun CreateCopyFromBuffer(
      source: IBuffer,
      format: BitmapPixelFormat,
      width: Int,
      height: Int,
      alpha: BitmapAlphaMode
    ) = ABI.ISoftwareBitmapStatics_Instance.CreateCopyFromBuffer(source, format, width, height,
        alpha)

    public fun CreateCopyFromSurfaceAsync(surface: IDirect3DSurface) =
        ABI.ISoftwareBitmapStatics_Instance.CreateCopyFromSurfaceAsync(surface)

    public fun CreateCopyFromSurfaceAsync(surface: IDirect3DSurface, alpha: BitmapAlphaMode) =
        ABI.ISoftwareBitmapStatics_Instance.CreateCopyFromSurfaceAsync(surface, alpha)
  }
}
