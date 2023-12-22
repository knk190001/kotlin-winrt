package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IActivatedEventArgs.ABI.IID
import Windows.ApplicationModel.UserDataAccounts.Provider.IUserDataAccountProviderOperation
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

@ABIMarker(IUserDataAccountProviderActivatedEventArgs.ABI::class)
@Signature("{1bc9f723-8ef1-4a51-a63a-fe711eeab607}")
@Guid("1bc9f7238ef14a51a63afe711eeab607")
@WinRTInterface("1bc9f7238ef14a51a63afe711eeab607")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataAccountProviderActivatedEventArgs.ByReference::class)
public interface IUserDataAccountProviderActivatedEventArgs : NativeMapped, IWinRTInterface,
    IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_Operation(): IUserDataAccountProviderOperation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataAccountProviderActivatedEventArgs> {
    public override fun getValue() =
        ABI.makeIUserDataAccountProviderActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IUserDataAccountProviderActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataAccountProviderActivatedEventArgs,
      IActivatedEventArgs.WithDefault {
    public val __1944704806_Ptr: Pointer?

    public val _1944704806_VtblPtr: Pointer?
      get() = __1944704806_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Operation(): IUserDataAccountProviderOperation? {
      val fnPtr = _1944704806_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUserDataAccountProviderOperation>()
      val hr = fn.invokeHR(arrayOf(__1944704806_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUserDataAccountProviderOperation>(result.getValue())
      return resultValue
    }
  }

  public class IUserDataAccountProviderActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IActivatedEventArgs {
    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1944704806_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1944704806_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataAccountProviderActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1bc9f7238ef14a51a63afe711eeab607")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataAccountProviderActivatedEventArgs(ptr: Pointer?): WithDefault =
        IUserDataAccountProviderActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IUserDataAccountProviderActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIUserDataAccountProviderActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IUserDataAccountProviderActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1944704806_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataAccountProviderActivatedEventArgs):
        Array<IUserDataAccountProviderActivatedEventArgs?> = (elements as
        Array<IUserDataAccountProviderActivatedEventArgs?>).castToImpl<IUserDataAccountProviderActivatedEventArgs,IUserDataAccountProviderActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataAccountProviderActivatedEventArgs?> =
        arrayOfNulls<IUserDataAccountProviderActivatedEventArgs_Impl>(size) as
        Array<IUserDataAccountProviderActivatedEventArgs?>
  }
}
