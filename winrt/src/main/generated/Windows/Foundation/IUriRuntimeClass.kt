package Windows.Foundation

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

@ABIMarker(IUriRuntimeClass.ABI::class)
@Signature("{9e365e57-48b2-4160-956f-c7385120bbfc}")
@Guid("9e365e5748b24160956fc7385120bbfc")
@WinRTInterface("9e365e5748b24160956fc7385120bbfc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUriRuntimeClass.ByReference::class)
public interface IUriRuntimeClass : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AbsoluteUri(): String?

  @InterfaceMethod(1)
  public fun get_DisplayUri(): String?

  @InterfaceMethod(2)
  public fun get_Domain(): String?

  @InterfaceMethod(3)
  public fun get_Extension(): String?

  @InterfaceMethod(4)
  public fun get_Fragment(): String?

  @InterfaceMethod(5)
  public fun get_Host(): String?

  @InterfaceMethod(6)
  public fun get_Password(): String?

  @InterfaceMethod(7)
  public fun get_Path(): String?

  @InterfaceMethod(8)
  public fun get_Query(): String?

  @InterfaceMethod(9)
  public fun get_QueryParsed(): WwwFormUrlDecoder?

  @InterfaceMethod(10)
  public fun get_RawUri(): String?

  @InterfaceMethod(11)
  public fun get_SchemeName(): String?

  @InterfaceMethod(12)
  public fun get_UserName(): String?

  @InterfaceMethod(13)
  public fun get_Port(): Int

  @InterfaceMethod(14)
  public fun get_Suspicious(): Boolean

  @InterfaceMethod(15)
  public fun Equals(pUri: Uri?): Boolean

  @InterfaceMethod(16)
  public fun CombineUri(relativeUri: String?): Uri?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUriRuntimeClass> {
    public override fun getValue() = ABI.makeIUriRuntimeClass(pointer.getPointer(0))

    public fun setValue(value: IUriRuntimeClass_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUriRuntimeClass {
    public val __2147049023_Ptr: Pointer?

    public val _2147049023_VtblPtr: Pointer?
      get() = __2147049023_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AbsoluteUri(): String? {
      val fnPtr = _2147049023_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2147049023_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DisplayUri(): String? {
      val fnPtr = _2147049023_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2147049023_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Domain(): String? {
      val fnPtr = _2147049023_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2147049023_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Extension(): String? {
      val fnPtr = _2147049023_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2147049023_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Fragment(): String? {
      val fnPtr = _2147049023_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2147049023_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Host(): String? {
      val fnPtr = _2147049023_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2147049023_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Password(): String? {
      val fnPtr = _2147049023_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2147049023_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_Path(): String? {
      val fnPtr = _2147049023_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2147049023_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_Query(): String? {
      val fnPtr = _2147049023_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2147049023_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_QueryParsed(): WwwFormUrlDecoder? {
      val fnPtr = _2147049023_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WwwFormUrlDecoder>()
      val hr = fn.invokeHR(arrayOf(__2147049023_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WwwFormUrlDecoder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_RawUri(): String? {
      val fnPtr = _2147049023_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2147049023_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_SchemeName(): String? {
      val fnPtr = _2147049023_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2147049023_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_UserName(): String? {
      val fnPtr = _2147049023_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2147049023_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_Port(): Int {
      val fnPtr = _2147049023_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2147049023_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun get_Suspicious(): Boolean {
      val fnPtr = _2147049023_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2147049023_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun Equals(pUri: Uri?): Boolean {
      val fnPtr = _2147049023_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2147049023_Ptr, marshalToNative(pUri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(16)
    public override fun CombineUri(relativeUri: String?): Uri? {
      val fnPtr = _2147049023_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__2147049023_Ptr, marshalToNative(relativeUri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }
  }

  public class IUriRuntimeClass_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2147049023_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUriRuntimeClass, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9e365e5748b24160956fc7385120bbfc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUriRuntimeClass(ptr: Pointer?): WithDefault = IUriRuntimeClass_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUriRuntimeClass {
      val address = segment.toRawLongValue()
      return makeIUriRuntimeClass(Pointer(address))
    }

    public override fun toNative(obj: IUriRuntimeClass): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2147049023_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUriRuntimeClass): Array<IUriRuntimeClass?> = (elements as
        Array<IUriRuntimeClass?>).castToImpl<IUriRuntimeClass,IUriRuntimeClass_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUriRuntimeClass?> =
        arrayOfNulls<IUriRuntimeClass_Impl>(size) as Array<IUriRuntimeClass?>
  }
}
