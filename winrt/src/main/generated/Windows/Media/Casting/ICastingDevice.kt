package Windows.Media.Casting

import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IRandomAccessStreamWithContentType
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICastingDevice.ABI::class)
@Signature("{de721c83-4a43-4ad1-a6d2-2492a796c3f2}")
@Guid("de721c834a434ad1a6d22492a796c3f2")
@WinRTInterface("de721c834a434ad1a6d22492a796c3f2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICastingDevice.ByReference::class)
public interface ICastingDevice : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_FriendlyName(): String?

  @InterfaceMethod(2)
  public fun get_Icon(): IRandomAccessStreamWithContentType?

  @InterfaceMethod(3)
  public fun GetSupportedCastingPlaybackTypesAsync(): IAsyncOperation<CastingPlaybackTypes?>?

  @InterfaceMethod(4)
  public fun CreateCastingConnection(): CastingConnection?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICastingDevice>
      {
    public override fun getValue() = ABI.makeICastingDevice(pointer.getPointer(0))

    public fun setValue(value: ICastingDevice_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICastingDevice {
    public val __115924514_Ptr: Pointer?

    public val _115924514_VtblPtr: Pointer?
      get() = __115924514_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _115924514_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__115924514_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_FriendlyName(): String? {
      val fnPtr = _115924514_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__115924514_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Icon(): IRandomAccessStreamWithContentType? {
      val fnPtr = _115924514_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamWithContentType>()
      val hr = fn.invokeHR(arrayOf(__115924514_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamWithContentType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetSupportedCastingPlaybackTypesAsync():
        IAsyncOperation<CastingPlaybackTypes?>? {
      val fnPtr = _115924514_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CastingPlaybackTypes?>>()
      val hr = fn.invokeHR(arrayOf(__115924514_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<CastingPlaybackTypes?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateCastingConnection(): CastingConnection? {
      val fnPtr = _115924514_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CastingConnection>()
      val hr = fn.invokeHR(arrayOf(__115924514_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CastingConnection>(result.getValue())
      return resultValue
    }
  }

  public class ICastingDevice_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __115924514_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICastingDevice, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("de721c834a434ad1a6d22492a796c3f2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICastingDevice(ptr: Pointer?): WithDefault = ICastingDevice_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICastingDevice {
      val address = segment.toRawLongValue()
      return makeICastingDevice(Pointer(address))
    }

    public override fun toNative(obj: ICastingDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__115924514_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICastingDevice): Array<ICastingDevice?> = (elements as
        Array<ICastingDevice?>).castToImpl<ICastingDevice,ICastingDevice_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICastingDevice?> =
        arrayOfNulls<ICastingDevice_Impl>(size) as Array<ICastingDevice?>
  }
}
