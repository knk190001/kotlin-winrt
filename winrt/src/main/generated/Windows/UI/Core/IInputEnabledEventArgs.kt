package Windows.UI.Core

import Windows.UI.Core.ICoreWindowEventArgs.ABI.IID
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInputEnabledEventArgs.ABI::class)
@Signature("{80371d4f-2fd8-4c24-aa86-3163a87b4e5a}")
@Guid("80371d4f2fd84c24aa863163a87b4e5a")
@WinRTInterface("80371d4f2fd84c24aa863163a87b4e5a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputEnabledEventArgs.ByReference::class)
public interface IInputEnabledEventArgs : NativeMapped, IWinRTInterface, ICoreWindowEventArgs {
  @InterfaceMethod(0)
  public fun get_InputEnabled(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputEnabledEventArgs> {
    public override fun getValue() = ABI.makeIInputEnabledEventArgs(pointer.getPointer(0))

    public fun setValue(value: IInputEnabledEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputEnabledEventArgs, ICoreWindowEventArgs.WithDefault {
    public val __750448827_Ptr: Pointer?

    public val _750448827_VtblPtr: Pointer?
      get() = __750448827_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InputEnabled(): Boolean {
      val fnPtr = _750448827_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__750448827_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IInputEnabledEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ICoreWindowEventArgs {
    public override val __407060269_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_750448827_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __750448827_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputEnabledEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("80371d4f2fd84c24aa863163a87b4e5a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputEnabledEventArgs(ptr: Pointer?): WithDefault =
        IInputEnabledEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputEnabledEventArgs {
      val address = segment.toRawLongValue()
      return makeIInputEnabledEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IInputEnabledEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__750448827_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputEnabledEventArgs): Array<IInputEnabledEventArgs?> =
        (elements as
        Array<IInputEnabledEventArgs?>).castToImpl<IInputEnabledEventArgs,IInputEnabledEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputEnabledEventArgs?> =
        arrayOfNulls<IInputEnabledEventArgs_Impl>(size) as Array<IInputEnabledEventArgs?>
  }
}
