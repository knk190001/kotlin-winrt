package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IActivatedEventArgs.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IRestrictedLaunchActivatedEventArgs.ABI::class)
@Signature("{e0b7ac81-bfc3-4344-a5da-19fd5a27baae}")
@Guid("e0b7ac81bfc34344a5da19fd5a27baae")
@WinRTInterface("e0b7ac81bfc34344a5da19fd5a27baae")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRestrictedLaunchActivatedEventArgs.ByReference::class)
public interface IRestrictedLaunchActivatedEventArgs : NativeMapped, IWinRTInterface,
    IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_SharedContext(): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRestrictedLaunchActivatedEventArgs> {
    public override fun getValue() =
        ABI.makeIRestrictedLaunchActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IRestrictedLaunchActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRestrictedLaunchActivatedEventArgs,
      IActivatedEventArgs.WithDefault {
    public val __1100793117_Ptr: Pointer?

    public val _1100793117_VtblPtr: Pointer?
      get() = __1100793117_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SharedContext(): IUnknown? {
      val fnPtr = _1100793117_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1100793117_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IRestrictedLaunchActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IActivatedEventArgs {
    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1100793117_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1100793117_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRestrictedLaunchActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e0b7ac81bfc34344a5da19fd5a27baae")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRestrictedLaunchActivatedEventArgs(ptr: Pointer?): WithDefault =
        IRestrictedLaunchActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRestrictedLaunchActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIRestrictedLaunchActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IRestrictedLaunchActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1100793117_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRestrictedLaunchActivatedEventArgs):
        Array<IRestrictedLaunchActivatedEventArgs?> = (elements as
        Array<IRestrictedLaunchActivatedEventArgs?>).castToImpl<IRestrictedLaunchActivatedEventArgs,IRestrictedLaunchActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRestrictedLaunchActivatedEventArgs?> =
        arrayOfNulls<IRestrictedLaunchActivatedEventArgs_Impl>(size) as
        Array<IRestrictedLaunchActivatedEventArgs?>
  }
}
