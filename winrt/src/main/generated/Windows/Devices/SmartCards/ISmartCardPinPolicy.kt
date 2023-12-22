package Windows.Devices.SmartCards

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

@ABIMarker(ISmartCardPinPolicy.ABI::class)
@Signature("{183ce184-4db6-4841-ac9e-2ac1f39b7304}")
@Guid("183ce1844db64841ac9e2ac1f39b7304")
@WinRTInterface("183ce1844db64841ac9e2ac1f39b7304")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardPinPolicy.ByReference::class)
public interface ISmartCardPinPolicy : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MinLength(): WinDef.UINT

  @InterfaceMethod(1)
  public fun put_MinLength(value: WinDef.UINT): Unit

  @InterfaceMethod(2)
  public fun get_MaxLength(): WinDef.UINT

  @InterfaceMethod(3)
  public fun put_MaxLength(value: WinDef.UINT): Unit

  @InterfaceMethod(4)
  public fun get_UppercaseLetters(): SmartCardPinCharacterPolicyOption?

  @InterfaceMethod(5)
  public fun put_UppercaseLetters(value: SmartCardPinCharacterPolicyOption?): Unit

  @InterfaceMethod(6)
  public fun get_LowercaseLetters(): SmartCardPinCharacterPolicyOption?

  @InterfaceMethod(7)
  public fun put_LowercaseLetters(value: SmartCardPinCharacterPolicyOption?): Unit

  @InterfaceMethod(8)
  public fun get_Digits(): SmartCardPinCharacterPolicyOption?

  @InterfaceMethod(9)
  public fun put_Digits(value: SmartCardPinCharacterPolicyOption?): Unit

  @InterfaceMethod(10)
  public fun get_SpecialCharacters(): SmartCardPinCharacterPolicyOption?

  @InterfaceMethod(11)
  public fun put_SpecialCharacters(value: SmartCardPinCharacterPolicyOption?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardPinPolicy> {
    public override fun getValue() = ABI.makeISmartCardPinPolicy(pointer.getPointer(0))

    public fun setValue(value: ISmartCardPinPolicy_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardPinPolicy {
    public val __936023903_Ptr: Pointer?

    public val _936023903_VtblPtr: Pointer?
      get() = __936023903_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MinLength(): WinDef.UINT {
      val fnPtr = _936023903_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__936023903_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_MinLength(value: WinDef.UINT): Unit {
      val fnPtr = _936023903_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__936023903_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_MaxLength(): WinDef.UINT {
      val fnPtr = _936023903_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__936023903_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_MaxLength(value: WinDef.UINT): Unit {
      val fnPtr = _936023903_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__936023903_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_UppercaseLetters(): SmartCardPinCharacterPolicyOption? {
      val fnPtr = _936023903_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCardPinCharacterPolicyOption>()
      val hr = fn.invokeHR(arrayOf(__936023903_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmartCardPinCharacterPolicyOption>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_UppercaseLetters(value: SmartCardPinCharacterPolicyOption?): Unit {
      val fnPtr = _936023903_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__936023903_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_LowercaseLetters(): SmartCardPinCharacterPolicyOption? {
      val fnPtr = _936023903_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCardPinCharacterPolicyOption>()
      val hr = fn.invokeHR(arrayOf(__936023903_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmartCardPinCharacterPolicyOption>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_LowercaseLetters(value: SmartCardPinCharacterPolicyOption?): Unit {
      val fnPtr = _936023903_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__936023903_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Digits(): SmartCardPinCharacterPolicyOption? {
      val fnPtr = _936023903_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCardPinCharacterPolicyOption>()
      val hr = fn.invokeHR(arrayOf(__936023903_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmartCardPinCharacterPolicyOption>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_Digits(value: SmartCardPinCharacterPolicyOption?): Unit {
      val fnPtr = _936023903_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__936023903_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_SpecialCharacters(): SmartCardPinCharacterPolicyOption? {
      val fnPtr = _936023903_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCardPinCharacterPolicyOption>()
      val hr = fn.invokeHR(arrayOf(__936023903_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmartCardPinCharacterPolicyOption>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_SpecialCharacters(value: SmartCardPinCharacterPolicyOption?): Unit {
      val fnPtr = _936023903_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__936023903_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISmartCardPinPolicy_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __936023903_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardPinPolicy, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("183ce1844db64841ac9e2ac1f39b7304")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardPinPolicy(ptr: Pointer?): WithDefault = ISmartCardPinPolicy_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardPinPolicy {
      val address = segment.toRawLongValue()
      return makeISmartCardPinPolicy(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardPinPolicy): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__936023903_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardPinPolicy): Array<ISmartCardPinPolicy?> =
        (elements as
        Array<ISmartCardPinPolicy?>).castToImpl<ISmartCardPinPolicy,ISmartCardPinPolicy_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardPinPolicy?> =
        arrayOfNulls<ISmartCardPinPolicy_Impl>(size) as Array<ISmartCardPinPolicy?>
  }
}
