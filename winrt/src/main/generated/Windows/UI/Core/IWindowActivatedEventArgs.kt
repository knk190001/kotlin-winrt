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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWindowActivatedEventArgs.ABI::class)
@Signature("{179d65e7-4658-4cb6-aa13-41d094ea255e}")
@Guid("179d65e746584cb6aa1341d094ea255e")
@WinRTInterface("179d65e746584cb6aa1341d094ea255e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWindowActivatedEventArgs.ByReference::class)
public interface IWindowActivatedEventArgs : NativeMapped, IWinRTInterface, ICoreWindowEventArgs {
  @InterfaceMethod(0)
  public fun get_WindowActivationState(): CoreWindowActivationState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWindowActivatedEventArgs> {
    public override fun getValue() = ABI.makeIWindowActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWindowActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWindowActivatedEventArgs, ICoreWindowEventArgs.WithDefault {
    public val __331133263_Ptr: Pointer?

    public val _331133263_VtblPtr: Pointer?
      get() = __331133263_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_WindowActivationState(): CoreWindowActivationState? {
      val fnPtr = _331133263_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWindowActivationState>()
      val hr = fn.invokeHR(arrayOf(__331133263_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWindowActivationState>(result.getValue())
      return resultValue
    }
  }

  public class IWindowActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ICoreWindowEventArgs {
    public override val __407060269_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_331133263_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __331133263_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWindowActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("179d65e746584cb6aa1341d094ea255e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWindowActivatedEventArgs(ptr: Pointer?): WithDefault =
        IWindowActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWindowActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWindowActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWindowActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__331133263_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWindowActivatedEventArgs):
        Array<IWindowActivatedEventArgs?> = (elements as
        Array<IWindowActivatedEventArgs?>).castToImpl<IWindowActivatedEventArgs,IWindowActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWindowActivatedEventArgs?> =
        arrayOfNulls<IWindowActivatedEventArgs_Impl>(size) as Array<IWindowActivatedEventArgs?>
  }
}
