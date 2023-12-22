package Windows.ApplicationModel.Store.Preview

import Windows.System.User
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

@ABIMarker(IStoreConfigurationStatics4.ABI::class)
@Signature("{20ff56d2-4ee3-4cf0-9b12-552c03310f75}")
@Guid("20ff56d24ee34cf09b12552c03310f75")
@WinRTInterface("20ff56d24ee34cf09b12552c03310f75")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoreConfigurationStatics4.ByReference::class)
public interface IStoreConfigurationStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetStoreWebAccountId(): String?

  @InterfaceMethod(1)
  public fun GetStoreWebAccountIdForUser(user: User?): String?

  @InterfaceMethod(2)
  public fun SetEnterpriseStoreWebAccountId(webAccountId: String?): Unit

  @InterfaceMethod(3)
  public fun SetEnterpriseStoreWebAccountIdForUser(user: User?, webAccountId: String?): Unit

  @InterfaceMethod(4)
  public fun GetEnterpriseStoreWebAccountId(): String?

  @InterfaceMethod(5)
  public fun GetEnterpriseStoreWebAccountIdForUser(user: User?): String?

  @InterfaceMethod(6)
  public fun ShouldRestrictToEnterpriseStoreOnly(): Boolean

  @InterfaceMethod(7)
  public fun ShouldRestrictToEnterpriseStoreOnlyForUser(user: User?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStoreConfigurationStatics4> {
    public override fun getValue() = ABI.makeIStoreConfigurationStatics4(pointer.getPointer(0))

    public fun setValue(value: IStoreConfigurationStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoreConfigurationStatics4 {
    public val __139180860_Ptr: Pointer?

    public val _139180860_VtblPtr: Pointer?
      get() = __139180860_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetStoreWebAccountId(): String? {
      val fnPtr = _139180860_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__139180860_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetStoreWebAccountIdForUser(user: User?): String? {
      val fnPtr = _139180860_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__139180860_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetEnterpriseStoreWebAccountId(webAccountId: String?): Unit {
      val fnPtr = _139180860_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__139180860_Ptr, marshalToNative(webAccountId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun SetEnterpriseStoreWebAccountIdForUser(user: User?, webAccountId: String?):
        Unit {
      val fnPtr = _139180860_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__139180860_Ptr, marshalToNative(user),
          marshalToNative(webAccountId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun GetEnterpriseStoreWebAccountId(): String? {
      val fnPtr = _139180860_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__139180860_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetEnterpriseStoreWebAccountIdForUser(user: User?): String? {
      val fnPtr = _139180860_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__139180860_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun ShouldRestrictToEnterpriseStoreOnly(): Boolean {
      val fnPtr = _139180860_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__139180860_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun ShouldRestrictToEnterpriseStoreOnlyForUser(user: User?): Boolean {
      val fnPtr = _139180860_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__139180860_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IStoreConfigurationStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __139180860_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoreConfigurationStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("20ff56d24ee34cf09b12552c03310f75")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoreConfigurationStatics4(ptr: Pointer?): WithDefault =
        IStoreConfigurationStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoreConfigurationStatics4 {
      val address = segment.toRawLongValue()
      return makeIStoreConfigurationStatics4(Pointer(address))
    }

    public override fun toNative(obj: IStoreConfigurationStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__139180860_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoreConfigurationStatics4):
        Array<IStoreConfigurationStatics4?> = (elements as
        Array<IStoreConfigurationStatics4?>).castToImpl<IStoreConfigurationStatics4,IStoreConfigurationStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoreConfigurationStatics4?> =
        arrayOfNulls<IStoreConfigurationStatics4_Impl>(size) as Array<IStoreConfigurationStatics4?>
  }
}
