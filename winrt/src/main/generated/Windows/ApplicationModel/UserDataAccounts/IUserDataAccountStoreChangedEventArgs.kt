package Windows.ApplicationModel.UserDataAccounts

import Windows.Foundation.Deferral
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUserDataAccountStoreChangedEventArgs.ABI::class)
@Signature("{84e3e2e5-8820-4512-b1f6-2e035be1072c}")
@Guid("84e3e2e588204512b1f62e035be1072c")
@WinRTInterface("84e3e2e588204512b1f62e035be1072c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataAccountStoreChangedEventArgs.ByReference::class)
public interface IUserDataAccountStoreChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataAccountStoreChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIUserDataAccountStoreChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IUserDataAccountStoreChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataAccountStoreChangedEventArgs {
    public val __1577545456_Ptr: Pointer?

    public val _1577545456_VtblPtr: Pointer?
      get() = __1577545456_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1577545456_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1577545456_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IUserDataAccountStoreChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1577545456_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataAccountStoreChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("84e3e2e588204512b1f62e035be1072c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataAccountStoreChangedEventArgs(ptr: Pointer?): WithDefault =
        IUserDataAccountStoreChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserDataAccountStoreChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIUserDataAccountStoreChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IUserDataAccountStoreChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1577545456_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataAccountStoreChangedEventArgs):
        Array<IUserDataAccountStoreChangedEventArgs?> = (elements as
        Array<IUserDataAccountStoreChangedEventArgs?>).castToImpl<IUserDataAccountStoreChangedEventArgs,IUserDataAccountStoreChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataAccountStoreChangedEventArgs?> =
        arrayOfNulls<IUserDataAccountStoreChangedEventArgs_Impl>(size) as
        Array<IUserDataAccountStoreChangedEventArgs?>
  }
}
