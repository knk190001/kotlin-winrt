package Windows.Web.Http.Headers

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

@ABIMarker(IHttpChallengeHeaderValueCollection.ABI::class)
@Signature("{ca9e5f81-aee0-4353-a10b-e625babd64c2}")
@Guid("ca9e5f81aee04353a10be625babd64c2")
@WinRTInterface("ca9e5f81aee04353a10be625babd64c2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpChallengeHeaderValueCollection.ByReference::class)
public interface IHttpChallengeHeaderValueCollection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ParseAdd(input: String?): Unit

  @InterfaceMethod(1)
  public fun TryParseAdd(input: String?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpChallengeHeaderValueCollection> {
    public override fun getValue() =
        ABI.makeIHttpChallengeHeaderValueCollection(pointer.getPointer(0))

    public fun setValue(value: IHttpChallengeHeaderValueCollection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpChallengeHeaderValueCollection {
    public val __122709525_Ptr: Pointer?

    public val _122709525_VtblPtr: Pointer?
      get() = __122709525_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ParseAdd(input: String?): Unit {
      val fnPtr = _122709525_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__122709525_Ptr, marshalToNative(input),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun TryParseAdd(input: String?): Boolean {
      val fnPtr = _122709525_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__122709525_Ptr, marshalToNative(input), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IHttpChallengeHeaderValueCollection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __122709525_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpChallengeHeaderValueCollection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ca9e5f81aee04353a10be625babd64c2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpChallengeHeaderValueCollection(ptr: Pointer?): WithDefault =
        IHttpChallengeHeaderValueCollection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpChallengeHeaderValueCollection {
      val address = segment.toRawLongValue()
      return makeIHttpChallengeHeaderValueCollection(Pointer(address))
    }

    public override fun toNative(obj: IHttpChallengeHeaderValueCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__122709525_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpChallengeHeaderValueCollection):
        Array<IHttpChallengeHeaderValueCollection?> = (elements as
        Array<IHttpChallengeHeaderValueCollection?>).castToImpl<IHttpChallengeHeaderValueCollection,IHttpChallengeHeaderValueCollection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpChallengeHeaderValueCollection?> =
        arrayOfNulls<IHttpChallengeHeaderValueCollection_Impl>(size) as
        Array<IHttpChallengeHeaderValueCollection?>
  }
}
