package Windows.ApplicationModel.Chat

import Windows.Foundation.IReference
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IChatMessageValidationResult.ABI::class)
@Signature("{25e93a03-28ec-5889-569b-7e486b126f18}")
@Guid("25e93a0328ec5889569b7e486b126f18")
@WinRTInterface("25e93a0328ec5889569b7e486b126f18")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatMessageValidationResult.ByReference::class)
public interface IChatMessageValidationResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MaxPartCount(): IReference<WinDef.UINT>?

  @InterfaceMethod(1)
  public fun get_PartCount(): IReference<WinDef.UINT>?

  @InterfaceMethod(2)
  public fun get_RemainingCharacterCountInPart(): IReference<WinDef.UINT>?

  @InterfaceMethod(3)
  public fun get_Status(): ChatMessageValidationStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatMessageValidationResult> {
    public override fun getValue() = ABI.makeIChatMessageValidationResult(pointer.getPointer(0))

    public fun setValue(value: IChatMessageValidationResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatMessageValidationResult {
    public val __1403411390_Ptr: Pointer?

    public val _1403411390_VtblPtr: Pointer?
      get() = __1403411390_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxPartCount(): IReference<WinDef.UINT>? {
      val fnPtr = _1403411390_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1403411390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PartCount(): IReference<WinDef.UINT>? {
      val fnPtr = _1403411390_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1403411390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_RemainingCharacterCountInPart(): IReference<WinDef.UINT>? {
      val fnPtr = _1403411390_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1403411390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Status(): ChatMessageValidationStatus? {
      val fnPtr = _1403411390_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ChatMessageValidationStatus>()
      val hr = fn.invokeHR(arrayOf(__1403411390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ChatMessageValidationStatus>(result.getValue())
      return resultValue
    }
  }

  public class IChatMessageValidationResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1403411390_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatMessageValidationResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("25e93a0328ec5889569b7e486b126f18")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatMessageValidationResult(ptr: Pointer?): WithDefault =
        IChatMessageValidationResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatMessageValidationResult {
      val address = segment.toRawLongValue()
      return makeIChatMessageValidationResult(Pointer(address))
    }

    public override fun toNative(obj: IChatMessageValidationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1403411390_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatMessageValidationResult):
        Array<IChatMessageValidationResult?> = (elements as
        Array<IChatMessageValidationResult?>).castToImpl<IChatMessageValidationResult,IChatMessageValidationResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatMessageValidationResult?> =
        arrayOfNulls<IChatMessageValidationResult_Impl>(size) as
        Array<IChatMessageValidationResult?>
  }
}
