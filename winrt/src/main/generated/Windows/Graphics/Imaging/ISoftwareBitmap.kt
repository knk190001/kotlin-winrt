package Windows.Graphics.Imaging

import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Storage.Streams.IBuffer
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISoftwareBitmap.ABI::class)
@Signature("{689e0708-7eef-483f-963f-da938818e073}")
@Guid("689e07087eef483f963fda938818e073")
@WinRTInterface("689e07087eef483f963fda938818e073")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISoftwareBitmap.ByReference::class)
public interface ISoftwareBitmap : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_BitmapPixelFormat(): BitmapPixelFormat?

  @InterfaceMethod(1)
  public fun get_BitmapAlphaMode(): BitmapAlphaMode?

  @InterfaceMethod(2)
  public fun get_PixelWidth(): Int

  @InterfaceMethod(3)
  public fun get_PixelHeight(): Int

  @InterfaceMethod(4)
  public fun get_IsReadOnly(): Boolean

  @InterfaceMethod(5)
  public fun put_DpiX(value: Double): Unit

  @InterfaceMethod(6)
  public fun get_DpiX(): Double

  @InterfaceMethod(7)
  public fun put_DpiY(value: Double): Unit

  @InterfaceMethod(8)
  public fun get_DpiY(): Double

  @InterfaceMethod(9)
  public fun LockBuffer(mode: BitmapBufferAccessMode?): BitmapBuffer?

  @InterfaceMethod(10)
  public fun CopyTo(bitmap: SoftwareBitmap?): Unit

  @InterfaceMethod(11)
  public fun CopyFromBuffer(buffer: IBuffer?): Unit

  @InterfaceMethod(12)
  public fun CopyToBuffer(buffer: IBuffer?): Unit

  @InterfaceMethod(13)
  public fun GetReadOnlyView(): SoftwareBitmap?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISoftwareBitmap> {
    public override fun getValue() = ABI.makeISoftwareBitmap(pointer.getPointer(0))

    public fun setValue(value: ISoftwareBitmap_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISoftwareBitmap, IClosable.WithDefault {
    public val __1342539583_Ptr: Pointer?

    public val _1342539583_VtblPtr: Pointer?
      get() = __1342539583_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BitmapPixelFormat(): BitmapPixelFormat? {
      val fnPtr = _1342539583_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapPixelFormat>()
      val hr = fn.invokeHR(arrayOf(__1342539583_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapPixelFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_BitmapAlphaMode(): BitmapAlphaMode? {
      val fnPtr = _1342539583_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapAlphaMode>()
      val hr = fn.invokeHR(arrayOf(__1342539583_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapAlphaMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PixelWidth(): Int {
      val fnPtr = _1342539583_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1342539583_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_PixelHeight(): Int {
      val fnPtr = _1342539583_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1342539583_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_IsReadOnly(): Boolean {
      val fnPtr = _1342539583_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1342539583_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_DpiX(value: Double): Unit {
      val fnPtr = _1342539583_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1342539583_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_DpiX(): Double {
      val fnPtr = _1342539583_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1342539583_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_DpiY(value: Double): Unit {
      val fnPtr = _1342539583_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1342539583_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_DpiY(): Double {
      val fnPtr = _1342539583_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1342539583_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun LockBuffer(mode: BitmapBufferAccessMode?): BitmapBuffer? {
      val fnPtr = _1342539583_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapBuffer>()
      val hr = fn.invokeHR(arrayOf(__1342539583_Ptr, marshalToNative(mode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun CopyTo(bitmap: SoftwareBitmap?): Unit {
      val fnPtr = _1342539583_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1342539583_Ptr, marshalToNative(bitmap),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun CopyFromBuffer(buffer: IBuffer?): Unit {
      val fnPtr = _1342539583_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1342539583_Ptr, marshalToNative(buffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun CopyToBuffer(buffer: IBuffer?): Unit {
      val fnPtr = _1342539583_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1342539583_Ptr, marshalToNative(buffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun GetReadOnlyView(): SoftwareBitmap? {
      val fnPtr = _1342539583_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SoftwareBitmap>()
      val hr = fn.invokeHR(arrayOf(__1342539583_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SoftwareBitmap>(result.getValue())
      return resultValue
    }
  }

  public class ISoftwareBitmap_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1342539583_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1342539583_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISoftwareBitmap, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("689e07087eef483f963fda938818e073")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISoftwareBitmap(ptr: Pointer?): WithDefault = ISoftwareBitmap_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISoftwareBitmap {
      val address = segment.toRawLongValue()
      return makeISoftwareBitmap(Pointer(address))
    }

    public override fun toNative(obj: ISoftwareBitmap): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1342539583_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISoftwareBitmap): Array<ISoftwareBitmap?> = (elements as
        Array<ISoftwareBitmap?>).castToImpl<ISoftwareBitmap,ISoftwareBitmap_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISoftwareBitmap?> =
        arrayOfNulls<ISoftwareBitmap_Impl>(size) as Array<ISoftwareBitmap?>
  }
}
