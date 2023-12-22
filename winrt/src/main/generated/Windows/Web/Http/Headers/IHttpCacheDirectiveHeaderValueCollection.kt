package Windows.Web.Http.Headers

import Windows.Foundation.IReference
import Windows.Foundation.TimeSpan
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHttpCacheDirectiveHeaderValueCollection.ABI::class)
@Signature("{9a586b89-d5d0-4fbe-bd9d-b5b3636811b4}")
@Guid("9a586b89d5d04fbebd9db5b3636811b4")
@WinRTInterface("9a586b89d5d04fbebd9db5b3636811b4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpCacheDirectiveHeaderValueCollection.ByReference::class)
public interface IHttpCacheDirectiveHeaderValueCollection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MaxAge(): IReference<TimeSpan?>?

  @InterfaceMethod(1)
  public fun put_MaxAge(value: IReference<TimeSpan?>?): Unit

  @InterfaceMethod(2)
  public fun get_MaxStale(): IReference<TimeSpan?>?

  @InterfaceMethod(3)
  public fun put_MaxStale(value: IReference<TimeSpan?>?): Unit

  @InterfaceMethod(4)
  public fun get_MinFresh(): IReference<TimeSpan?>?

  @InterfaceMethod(5)
  public fun put_MinFresh(value: IReference<TimeSpan?>?): Unit

  @InterfaceMethod(6)
  public fun get_SharedMaxAge(): IReference<TimeSpan?>?

  @InterfaceMethod(7)
  public fun put_SharedMaxAge(value: IReference<TimeSpan?>?): Unit

  @InterfaceMethod(8)
  public fun ParseAdd(input: String?): Unit

  @InterfaceMethod(9)
  public fun TryParseAdd(input: String?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpCacheDirectiveHeaderValueCollection> {
    public override fun getValue() =
        ABI.makeIHttpCacheDirectiveHeaderValueCollection(pointer.getPointer(0))

    public fun setValue(value: IHttpCacheDirectiveHeaderValueCollection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpCacheDirectiveHeaderValueCollection {
    public val __1511021897_Ptr: Pointer?

    public val _1511021897_VtblPtr: Pointer?
      get() = __1511021897_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxAge(): IReference<TimeSpan?>? {
      val fnPtr = _1511021897_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__1511021897_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_MaxAge(value: IReference<TimeSpan?>?): Unit {
      val fnPtr = _1511021897_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1511021897_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_MaxStale(): IReference<TimeSpan?>? {
      val fnPtr = _1511021897_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__1511021897_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_MaxStale(value: IReference<TimeSpan?>?): Unit {
      val fnPtr = _1511021897_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1511021897_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_MinFresh(): IReference<TimeSpan?>? {
      val fnPtr = _1511021897_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__1511021897_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_MinFresh(value: IReference<TimeSpan?>?): Unit {
      val fnPtr = _1511021897_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1511021897_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_SharedMaxAge(): IReference<TimeSpan?>? {
      val fnPtr = _1511021897_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__1511021897_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_SharedMaxAge(value: IReference<TimeSpan?>?): Unit {
      val fnPtr = _1511021897_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1511021897_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun ParseAdd(input: String?): Unit {
      val fnPtr = _1511021897_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1511021897_Ptr, marshalToNative(input),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun TryParseAdd(input: String?): Boolean {
      val fnPtr = _1511021897_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1511021897_Ptr, marshalToNative(input), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IHttpCacheDirectiveHeaderValueCollection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1511021897_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpCacheDirectiveHeaderValueCollection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9a586b89d5d04fbebd9db5b3636811b4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpCacheDirectiveHeaderValueCollection(ptr: Pointer?): WithDefault =
        IHttpCacheDirectiveHeaderValueCollection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IHttpCacheDirectiveHeaderValueCollection {
      val address = segment.toRawLongValue()
      return makeIHttpCacheDirectiveHeaderValueCollection(Pointer(address))
    }

    public override fun toNative(obj: IHttpCacheDirectiveHeaderValueCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1511021897_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpCacheDirectiveHeaderValueCollection):
        Array<IHttpCacheDirectiveHeaderValueCollection?> = (elements as
        Array<IHttpCacheDirectiveHeaderValueCollection?>).castToImpl<IHttpCacheDirectiveHeaderValueCollection,IHttpCacheDirectiveHeaderValueCollection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpCacheDirectiveHeaderValueCollection?> =
        arrayOfNulls<IHttpCacheDirectiveHeaderValueCollection_Impl>(size) as
        Array<IHttpCacheDirectiveHeaderValueCollection?>
  }
}
