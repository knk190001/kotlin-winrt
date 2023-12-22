package Windows.ApplicationModel.Chat

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

@ABIMarker(IRcsServiceKindSupportedChangedEventArgs.ABI::class)
@Signature("{f47ea244-e783-4866-b3a7-4e5ccf023070}")
@Guid("f47ea244e7834866b3a74e5ccf023070")
@WinRTInterface("f47ea244e7834866b3a74e5ccf023070")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRcsServiceKindSupportedChangedEventArgs.ByReference::class)
public interface IRcsServiceKindSupportedChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ServiceKind(): RcsServiceKind?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRcsServiceKindSupportedChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIRcsServiceKindSupportedChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IRcsServiceKindSupportedChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRcsServiceKindSupportedChangedEventArgs {
    public val __821035197_Ptr: Pointer?

    public val _821035197_VtblPtr: Pointer?
      get() = __821035197_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ServiceKind(): RcsServiceKind? {
      val fnPtr = _821035197_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RcsServiceKind>()
      val hr = fn.invokeHR(arrayOf(__821035197_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RcsServiceKind>(result.getValue())
      return resultValue
    }
  }

  public class IRcsServiceKindSupportedChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __821035197_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRcsServiceKindSupportedChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f47ea244e7834866b3a74e5ccf023070")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRcsServiceKindSupportedChangedEventArgs(ptr: Pointer?): WithDefault =
        IRcsServiceKindSupportedChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IRcsServiceKindSupportedChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIRcsServiceKindSupportedChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IRcsServiceKindSupportedChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__821035197_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRcsServiceKindSupportedChangedEventArgs):
        Array<IRcsServiceKindSupportedChangedEventArgs?> = (elements as
        Array<IRcsServiceKindSupportedChangedEventArgs?>).castToImpl<IRcsServiceKindSupportedChangedEventArgs,IRcsServiceKindSupportedChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRcsServiceKindSupportedChangedEventArgs?> =
        arrayOfNulls<IRcsServiceKindSupportedChangedEventArgs_Impl>(size) as
        Array<IRcsServiceKindSupportedChangedEventArgs?>
  }
}
