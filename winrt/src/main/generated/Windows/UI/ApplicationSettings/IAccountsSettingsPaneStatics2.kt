package Windows.UI.ApplicationSettings

import Windows.Foundation.IAsyncAction
import Windows.UI.ApplicationSettings.IAccountsSettingsPaneStatics.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IAccountsSettingsPaneStatics2.ABI::class)
@Signature("{d21df7c2-ce0d-484f-b8e8-e823c215765e}")
@Guid("d21df7c2ce0d484fb8e8e823c215765e")
@WinRTInterface("d21df7c2ce0d484fb8e8e823c215765e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAccountsSettingsPaneStatics2.ByReference::class)
public interface IAccountsSettingsPaneStatics2 : NativeMapped, IWinRTInterface,
    IAccountsSettingsPaneStatics {
  @InterfaceMethod(0)
  public fun ShowManageAccountsAsync(): IAsyncAction?

  @InterfaceMethod(1)
  public fun ShowAddAccountAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAccountsSettingsPaneStatics2> {
    public override fun getValue() = ABI.makeIAccountsSettingsPaneStatics2(pointer.getPointer(0))

    public fun setValue(value: IAccountsSettingsPaneStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAccountsSettingsPaneStatics2,
      IAccountsSettingsPaneStatics.WithDefault {
    public val __708718019_Ptr: Pointer?

    public val _708718019_VtblPtr: Pointer?
      get() = __708718019_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ShowManageAccountsAsync(): IAsyncAction? {
      val fnPtr = _708718019_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__708718019_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ShowAddAccountAsync(): IAsyncAction? {
      val fnPtr = _708718019_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__708718019_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IAccountsSettingsPaneStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IAccountsSettingsPaneStatics {
    public override val __1131240527_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_708718019_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __708718019_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAccountsSettingsPaneStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d21df7c2ce0d484fb8e8e823c215765e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAccountsSettingsPaneStatics2(ptr: Pointer?): WithDefault =
        IAccountsSettingsPaneStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAccountsSettingsPaneStatics2 {
      val address = segment.toRawLongValue()
      return makeIAccountsSettingsPaneStatics2(Pointer(address))
    }

    public override fun toNative(obj: IAccountsSettingsPaneStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__708718019_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAccountsSettingsPaneStatics2):
        Array<IAccountsSettingsPaneStatics2?> = (elements as
        Array<IAccountsSettingsPaneStatics2?>).castToImpl<IAccountsSettingsPaneStatics2,IAccountsSettingsPaneStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAccountsSettingsPaneStatics2?> =
        arrayOfNulls<IAccountsSettingsPaneStatics2_Impl>(size) as
        Array<IAccountsSettingsPaneStatics2?>
  }
}
