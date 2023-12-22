package Windows.ApplicationModel.Store.Preview

import Windows.Foundation.IAsyncOperation
import Windows.Foundation.IReference
import Windows.Storage.Streams.IRandomAccessStreamReference
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IStoreConfigurationStatics3.ABI::class)
@Signature("{6d45f57c-f144-4cb5-9d3f-4eb05e30b6d3}")
@Guid("6d45f57cf1444cb59d3f4eb05e30b6d3")
@WinRTInterface("6d45f57cf1444cb59d3f4eb05e30b6d3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoreConfigurationStatics3.ByReference::class)
public interface IStoreConfigurationStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun HasStoreWebAccount(): Boolean

  @InterfaceMethod(1)
  public fun HasStoreWebAccountForUser(user: User?): Boolean

  @InterfaceMethod(2)
  public fun GetStoreLogDataAsync(options: StoreLogOptions?):
      IAsyncOperation<IRandomAccessStreamReference?>?

  @InterfaceMethod(3)
  public fun SetStoreWebAccountIdForUser(user: User?, webAccountId: String?): Unit

  @InterfaceMethod(4)
  public fun IsStoreWebAccountIdForUser(user: User?, webAccountId: String?): Boolean

  @InterfaceMethod(5)
  public fun GetPurchasePromptingPolicyForUser(user: User?): IReference<WinDef.UINT>?

  @InterfaceMethod(6)
  public fun SetPurchasePromptingPolicyForUser(user: User?, value: IReference<WinDef.UINT>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStoreConfigurationStatics3> {
    public override fun getValue() = ABI.makeIStoreConfigurationStatics3(pointer.getPointer(0))

    public fun setValue(value: IStoreConfigurationStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoreConfigurationStatics3 {
    public val __139180859_Ptr: Pointer?

    public val _139180859_VtblPtr: Pointer?
      get() = __139180859_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun HasStoreWebAccount(): Boolean {
      val fnPtr = _139180859_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__139180859_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun HasStoreWebAccountForUser(user: User?): Boolean {
      val fnPtr = _139180859_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__139180859_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun GetStoreLogDataAsync(options: StoreLogOptions?):
        IAsyncOperation<IRandomAccessStreamReference?>? {
      val fnPtr = _139180859_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IRandomAccessStreamReference?>>()
      val hr = fn.invokeHR(arrayOf(__139180859_Ptr, marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IRandomAccessStreamReference?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SetStoreWebAccountIdForUser(user: User?, webAccountId: String?): Unit {
      val fnPtr = _139180859_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__139180859_Ptr, marshalToNative(user),
          marshalToNative(webAccountId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun IsStoreWebAccountIdForUser(user: User?, webAccountId: String?): Boolean {
      val fnPtr = _139180859_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__139180859_Ptr, marshalToNative(user),
          marshalToNative(webAccountId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun GetPurchasePromptingPolicyForUser(user: User?): IReference<WinDef.UINT>? {
      val fnPtr = _139180859_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__139180859_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun SetPurchasePromptingPolicyForUser(user: User?,
        value: IReference<WinDef.UINT>?): Unit {
      val fnPtr = _139180859_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__139180859_Ptr, marshalToNative(user), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStoreConfigurationStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __139180859_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoreConfigurationStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6d45f57cf1444cb59d3f4eb05e30b6d3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoreConfigurationStatics3(ptr: Pointer?): WithDefault =
        IStoreConfigurationStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoreConfigurationStatics3 {
      val address = segment.toRawLongValue()
      return makeIStoreConfigurationStatics3(Pointer(address))
    }

    public override fun toNative(obj: IStoreConfigurationStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__139180859_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoreConfigurationStatics3):
        Array<IStoreConfigurationStatics3?> = (elements as
        Array<IStoreConfigurationStatics3?>).castToImpl<IStoreConfigurationStatics3,IStoreConfigurationStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoreConfigurationStatics3?> =
        arrayOfNulls<IStoreConfigurationStatics3_Impl>(size) as Array<IStoreConfigurationStatics3?>
  }
}
