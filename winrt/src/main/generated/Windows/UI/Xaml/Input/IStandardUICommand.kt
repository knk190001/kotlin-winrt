package Windows.UI.Xaml.Input

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

@ABIMarker(IStandardUICommand.ABI::class)
@Signature("{d2bf7f43-0504-52d0-8aa6-0cb0f756eb27}")
@Guid("d2bf7f43050452d08aa60cb0f756eb27")
@WinRTInterface("d2bf7f43050452d08aa60cb0f756eb27")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStandardUICommand.ByReference::class)
public interface IStandardUICommand : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Kind(): StandardUICommandKind?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStandardUICommand> {
    public override fun getValue() = ABI.makeIStandardUICommand(pointer.getPointer(0))

    public fun setValue(value: IStandardUICommand_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStandardUICommand {
    public val __1287119844_Ptr: Pointer?

    public val _1287119844_VtblPtr: Pointer?
      get() = __1287119844_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Kind(): StandardUICommandKind? {
      val fnPtr = _1287119844_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StandardUICommandKind>()
      val hr = fn.invokeHR(arrayOf(__1287119844_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StandardUICommandKind>(result.getValue())
      return resultValue
    }
  }

  public class IStandardUICommand_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1287119844_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStandardUICommand, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d2bf7f43050452d08aa60cb0f756eb27")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStandardUICommand(ptr: Pointer?): WithDefault = IStandardUICommand_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStandardUICommand {
      val address = segment.toRawLongValue()
      return makeIStandardUICommand(Pointer(address))
    }

    public override fun toNative(obj: IStandardUICommand): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1287119844_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStandardUICommand): Array<IStandardUICommand?> =
        (elements as
        Array<IStandardUICommand?>).castToImpl<IStandardUICommand,IStandardUICommand_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStandardUICommand?> =
        arrayOfNulls<IStandardUICommand_Impl>(size) as Array<IStandardUICommand?>
  }
}
