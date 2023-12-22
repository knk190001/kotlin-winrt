package Windows.Web.Syndication

import Windows.Foundation.Uri
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

@ABIMarker(ISyndicationGenerator.ABI::class)
@Signature("{9768b379-fb2b-4f6d-b41c-088a5868825c}")
@Guid("9768b379fb2b4f6db41c088a5868825c")
@WinRTInterface("9768b379fb2b4f6db41c088a5868825c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISyndicationGenerator.ByReference::class)
public interface ISyndicationGenerator : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Text(): String?

  @InterfaceMethod(1)
  public fun put_Text(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Uri(): Uri?

  @InterfaceMethod(3)
  public fun put_Uri(value: Uri?): Unit

  @InterfaceMethod(4)
  public fun get_Version(): String?

  @InterfaceMethod(5)
  public fun put_Version(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISyndicationGenerator> {
    public override fun getValue() = ABI.makeISyndicationGenerator(pointer.getPointer(0))

    public fun setValue(value: ISyndicationGenerator_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISyndicationGenerator {
    public val __1236956451_Ptr: Pointer?

    public val _1236956451_VtblPtr: Pointer?
      get() = __1236956451_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Text(): String? {
      val fnPtr = _1236956451_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1236956451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Text(value: String?): Unit {
      val fnPtr = _1236956451_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1236956451_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Uri(): Uri? {
      val fnPtr = _1236956451_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1236956451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Uri(value: Uri?): Unit {
      val fnPtr = _1236956451_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1236956451_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Version(): String? {
      val fnPtr = _1236956451_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1236956451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Version(value: String?): Unit {
      val fnPtr = _1236956451_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1236956451_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISyndicationGenerator_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1236956451_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISyndicationGenerator, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9768b379fb2b4f6db41c088a5868825c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISyndicationGenerator(ptr: Pointer?): WithDefault =
        ISyndicationGenerator_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISyndicationGenerator {
      val address = segment.toRawLongValue()
      return makeISyndicationGenerator(Pointer(address))
    }

    public override fun toNative(obj: ISyndicationGenerator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1236956451_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISyndicationGenerator): Array<ISyndicationGenerator?> =
        (elements as
        Array<ISyndicationGenerator?>).castToImpl<ISyndicationGenerator,ISyndicationGenerator_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISyndicationGenerator?> =
        arrayOfNulls<ISyndicationGenerator_Impl>(size) as Array<ISyndicationGenerator?>
  }
}
