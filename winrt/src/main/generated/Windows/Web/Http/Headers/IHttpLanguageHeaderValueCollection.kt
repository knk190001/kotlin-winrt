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

@ABIMarker(IHttpLanguageHeaderValueCollection.ABI::class)
@Signature("{9ebd7ca3-8219-44f6-9902-8c56dfd3340c}")
@Guid("9ebd7ca3821944f699028c56dfd3340c")
@WinRTInterface("9ebd7ca3821944f699028c56dfd3340c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpLanguageHeaderValueCollection.ByReference::class)
public interface IHttpLanguageHeaderValueCollection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ParseAdd(input: String?): Unit

  @InterfaceMethod(1)
  public fun TryParseAdd(input: String?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpLanguageHeaderValueCollection> {
    public override fun getValue() =
        ABI.makeIHttpLanguageHeaderValueCollection(pointer.getPointer(0))

    public fun setValue(value: IHttpLanguageHeaderValueCollection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpLanguageHeaderValueCollection {
    public val __2100974782_Ptr: Pointer?

    public val _2100974782_VtblPtr: Pointer?
      get() = __2100974782_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ParseAdd(input: String?): Unit {
      val fnPtr = _2100974782_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2100974782_Ptr, marshalToNative(input),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun TryParseAdd(input: String?): Boolean {
      val fnPtr = _2100974782_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2100974782_Ptr, marshalToNative(input), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IHttpLanguageHeaderValueCollection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2100974782_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpLanguageHeaderValueCollection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9ebd7ca3821944f699028c56dfd3340c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpLanguageHeaderValueCollection(ptr: Pointer?): WithDefault =
        IHttpLanguageHeaderValueCollection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpLanguageHeaderValueCollection {
      val address = segment.toRawLongValue()
      return makeIHttpLanguageHeaderValueCollection(Pointer(address))
    }

    public override fun toNative(obj: IHttpLanguageHeaderValueCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2100974782_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpLanguageHeaderValueCollection):
        Array<IHttpLanguageHeaderValueCollection?> = (elements as
        Array<IHttpLanguageHeaderValueCollection?>).castToImpl<IHttpLanguageHeaderValueCollection,IHttpLanguageHeaderValueCollection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpLanguageHeaderValueCollection?> =
        arrayOfNulls<IHttpLanguageHeaderValueCollection_Impl>(size) as
        Array<IHttpLanguageHeaderValueCollection?>
  }
}
