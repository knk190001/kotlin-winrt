package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IActivatedEventArgs.ABI.IID
import Windows.ApplicationModel.Wallet.WalletActionKind
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWalletActionActivatedEventArgs.ABI::class)
@Signature("{fcfc027b-1a1a-4d22-923f-ae6f45fa52d9}")
@Guid("fcfc027b1a1a4d22923fae6f45fa52d9")
@WinRTInterface("fcfc027b1a1a4d22923fae6f45fa52d9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWalletActionActivatedEventArgs.ByReference::class)
public interface IWalletActionActivatedEventArgs : NativeMapped, IWinRTInterface,
    IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_ItemId(): String?

  @InterfaceMethod(1)
  public fun get_ActionKind(): WalletActionKind?

  @InterfaceMethod(2)
  public fun get_ActionId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWalletActionActivatedEventArgs> {
    public override fun getValue() = ABI.makeIWalletActionActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWalletActionActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWalletActionActivatedEventArgs, IActivatedEventArgs.WithDefault {
    public val __1344291582_Ptr: Pointer?

    public val _1344291582_VtblPtr: Pointer?
      get() = __1344291582_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ItemId(): String? {
      val fnPtr = _1344291582_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1344291582_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ActionKind(): WalletActionKind? {
      val fnPtr = _1344291582_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WalletActionKind>()
      val hr = fn.invokeHR(arrayOf(__1344291582_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WalletActionKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ActionId(): String? {
      val fnPtr = _1344291582_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1344291582_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IWalletActionActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IActivatedEventArgs {
    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1344291582_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1344291582_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWalletActionActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fcfc027b1a1a4d22923fae6f45fa52d9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWalletActionActivatedEventArgs(ptr: Pointer?): WithDefault =
        IWalletActionActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWalletActionActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWalletActionActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWalletActionActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1344291582_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWalletActionActivatedEventArgs):
        Array<IWalletActionActivatedEventArgs?> = (elements as
        Array<IWalletActionActivatedEventArgs?>).castToImpl<IWalletActionActivatedEventArgs,IWalletActionActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWalletActionActivatedEventArgs?> =
        arrayOfNulls<IWalletActionActivatedEventArgs_Impl>(size) as
        Array<IWalletActionActivatedEventArgs?>
  }
}
