package Windows.Storage.Search

import Windows.Foundation.Collections.IMap
import Windows.Storage.Streams.IRandomAccessStream
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

@ABIMarker(IIndexableContent.ABI::class)
@Signature("{ccf1a05f-d4b5-483a-b06e-e0db1ec420e4}")
@Guid("ccf1a05fd4b5483ab06ee0db1ec420e4")
@WinRTInterface("ccf1a05fd4b5483ab06ee0db1ec420e4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIndexableContent.ByReference::class)
public interface IIndexableContent : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun put_Id(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Properties(): IMap<String?, IUnknown?>?

  @InterfaceMethod(3)
  public fun get_Stream(): IRandomAccessStream?

  @InterfaceMethod(4)
  public fun put_Stream(value: IRandomAccessStream?): Unit

  @InterfaceMethod(5)
  public fun get_StreamContentType(): String?

  @InterfaceMethod(6)
  public fun put_StreamContentType(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIndexableContent> {
    public override fun getValue() = ABI.makeIIndexableContent(pointer.getPointer(0))

    public fun setValue(value: IIndexableContent_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIndexableContent {
    public val __1667156688_Ptr: Pointer?

    public val _1667156688_VtblPtr: Pointer?
      get() = __1667156688_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _1667156688_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1667156688_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Id(value: String?): Unit {
      val fnPtr = _1667156688_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1667156688_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Properties(): IMap<String?, IUnknown?>? {
      val fnPtr = _1667156688_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<String?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__1667156688_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<String?, IUnknown?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Stream(): IRandomAccessStream? {
      val fnPtr = _1667156688_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStream>()
      val hr = fn.invokeHR(arrayOf(__1667156688_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_Stream(value: IRandomAccessStream?): Unit {
      val fnPtr = _1667156688_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1667156688_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_StreamContentType(): String? {
      val fnPtr = _1667156688_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1667156688_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_StreamContentType(value: String?): Unit {
      val fnPtr = _1667156688_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1667156688_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IIndexableContent_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1667156688_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIndexableContent, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ccf1a05fd4b5483ab06ee0db1ec420e4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIndexableContent(ptr: Pointer?): WithDefault = IIndexableContent_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIndexableContent {
      val address = segment.toRawLongValue()
      return makeIIndexableContent(Pointer(address))
    }

    public override fun toNative(obj: IIndexableContent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1667156688_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIndexableContent): Array<IIndexableContent?> = (elements
        as Array<IIndexableContent?>).castToImpl<IIndexableContent,IIndexableContent_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIndexableContent?> =
        arrayOfNulls<IIndexableContent_Impl>(size) as Array<IIndexableContent?>
  }
}
