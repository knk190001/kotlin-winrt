package Windows.Media.Protection

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

@ABIMarker(IRevocationAndRenewalItem.ABI::class)
@Signature("{3099c20c-3cf0-49ea-902d-caf32d2dde2c}")
@Guid("3099c20c3cf049ea902dcaf32d2dde2c")
@WinRTInterface("3099c20c3cf049ea902dcaf32d2dde2c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRevocationAndRenewalItem.ByReference::class)
public interface IRevocationAndRenewalItem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reasons(): RevocationAndRenewalReasons?

  @InterfaceMethod(1)
  public fun get_HeaderHash(): String?

  @InterfaceMethod(2)
  public fun get_PublicKeyHash(): String?

  @InterfaceMethod(3)
  public fun get_Name(): String?

  @InterfaceMethod(4)
  public fun get_RenewalId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRevocationAndRenewalItem> {
    public override fun getValue() = ABI.makeIRevocationAndRenewalItem(pointer.getPointer(0))

    public fun setValue(value: IRevocationAndRenewalItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRevocationAndRenewalItem {
    public val __1109990701_Ptr: Pointer?

    public val _1109990701_VtblPtr: Pointer?
      get() = __1109990701_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reasons(): RevocationAndRenewalReasons? {
      val fnPtr = _1109990701_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RevocationAndRenewalReasons>()
      val hr = fn.invokeHR(arrayOf(__1109990701_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RevocationAndRenewalReasons>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HeaderHash(): String? {
      val fnPtr = _1109990701_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1109990701_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PublicKeyHash(): String? {
      val fnPtr = _1109990701_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1109990701_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Name(): String? {
      val fnPtr = _1109990701_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1109990701_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_RenewalId(): String? {
      val fnPtr = _1109990701_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1109990701_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IRevocationAndRenewalItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1109990701_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRevocationAndRenewalItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3099c20c3cf049ea902dcaf32d2dde2c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRevocationAndRenewalItem(ptr: Pointer?): WithDefault =
        IRevocationAndRenewalItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRevocationAndRenewalItem {
      val address = segment.toRawLongValue()
      return makeIRevocationAndRenewalItem(Pointer(address))
    }

    public override fun toNative(obj: IRevocationAndRenewalItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1109990701_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRevocationAndRenewalItem):
        Array<IRevocationAndRenewalItem?> = (elements as
        Array<IRevocationAndRenewalItem?>).castToImpl<IRevocationAndRenewalItem,IRevocationAndRenewalItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRevocationAndRenewalItem?> =
        arrayOfNulls<IRevocationAndRenewalItem_Impl>(size) as Array<IRevocationAndRenewalItem?>
  }
}
