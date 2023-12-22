package Windows.Media.PlayTo

import Windows.Foundation.Collections.IMapView
import Windows.Foundation.DateTime
import Windows.Foundation.IReference
import Windows.Storage.Streams.IRandomAccessStreamReference
import Windows.Storage.Streams.IRandomAccessStreamWithContentType
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ISourceChangeRequestedEventArgs.ABI::class)
@Signature("{fb3f3a96-7aa6-4a8b-86e7-54f6c6d34f64}")
@Guid("fb3f3a967aa64a8b86e754f6c6d34f64")
@WinRTInterface("fb3f3a967aa64a8b86e754f6c6d34f64")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISourceChangeRequestedEventArgs.ByReference::class)
public interface ISourceChangeRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Stream(): IRandomAccessStreamWithContentType?

  @InterfaceMethod(1)
  public fun get_Title(): String?

  @InterfaceMethod(2)
  public fun get_Author(): String?

  @InterfaceMethod(3)
  public fun get_Album(): String?

  @InterfaceMethod(4)
  public fun get_Genre(): String?

  @InterfaceMethod(5)
  public fun get_Description(): String?

  @InterfaceMethod(6)
  public fun get_Date(): IReference<DateTime?>?

  @InterfaceMethod(7)
  public fun get_Thumbnail(): IRandomAccessStreamReference?

  @InterfaceMethod(8)
  public fun get_Rating(): IReference<WinDef.UINT>?

  @InterfaceMethod(9)
  public fun get_Properties(): IMapView<String?, IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISourceChangeRequestedEventArgs> {
    public override fun getValue() = ABI.makeISourceChangeRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISourceChangeRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISourceChangeRequestedEventArgs {
    public val __729799687_Ptr: Pointer?

    public val _729799687_VtblPtr: Pointer?
      get() = __729799687_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Stream(): IRandomAccessStreamWithContentType? {
      val fnPtr = _729799687_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamWithContentType>()
      val hr = fn.invokeHR(arrayOf(__729799687_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamWithContentType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Title(): String? {
      val fnPtr = _729799687_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__729799687_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Author(): String? {
      val fnPtr = _729799687_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__729799687_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Album(): String? {
      val fnPtr = _729799687_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__729799687_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Genre(): String? {
      val fnPtr = _729799687_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__729799687_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Description(): String? {
      val fnPtr = _729799687_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__729799687_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Date(): IReference<DateTime?>? {
      val fnPtr = _729799687_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__729799687_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_Thumbnail(): IRandomAccessStreamReference? {
      val fnPtr = _729799687_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__729799687_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_Rating(): IReference<WinDef.UINT>? {
      val fnPtr = _729799687_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__729799687_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_Properties(): IMapView<String?, IUnknown?>? {
      val fnPtr = _729799687_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__729799687_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class ISourceChangeRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __729799687_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISourceChangeRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fb3f3a967aa64a8b86e754f6c6d34f64")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISourceChangeRequestedEventArgs(ptr: Pointer?): WithDefault =
        ISourceChangeRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISourceChangeRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeISourceChangeRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISourceChangeRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__729799687_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISourceChangeRequestedEventArgs):
        Array<ISourceChangeRequestedEventArgs?> = (elements as
        Array<ISourceChangeRequestedEventArgs?>).castToImpl<ISourceChangeRequestedEventArgs,ISourceChangeRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISourceChangeRequestedEventArgs?> =
        arrayOfNulls<ISourceChangeRequestedEventArgs_Impl>(size) as
        Array<ISourceChangeRequestedEventArgs?>
  }
}
