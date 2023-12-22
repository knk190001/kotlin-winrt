package Windows.UI.Core

import Windows.Foundation.Size
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

@ABIMarker(IWindowSizeChangedEventArgs.ABI::class)
@Signature("{5a200ec7-0426-47dc-b86c-6f475915e451}")
@Guid("5a200ec7042647dcb86c6f475915e451")
@WinRTInterface("5a200ec7042647dcb86c6f475915e451")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWindowSizeChangedEventArgs.ByReference::class)
public interface IWindowSizeChangedEventArgs : NativeMapped, IWinRTInterface, ICoreWindowEventArgs {
  @InterfaceMethod(0)
  public fun get_Size(): Size?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWindowSizeChangedEventArgs> {
    public override fun getValue() = ABI.makeIWindowSizeChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWindowSizeChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWindowSizeChangedEventArgs, ICoreWindowEventArgs.WithDefault {
    public val __247990129_Ptr: Pointer?

    public val _247990129_VtblPtr: Pointer?
      get() = __247990129_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Size(): Size? {
      val fnPtr = _247990129_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__247990129_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }
  }

  public class IWindowSizeChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ICoreWindowEventArgs {
    public override val __407060269_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_247990129_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __247990129_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWindowSizeChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5a200ec7042647dcb86c6f475915e451")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWindowSizeChangedEventArgs(ptr: Pointer?): WithDefault =
        IWindowSizeChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWindowSizeChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWindowSizeChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWindowSizeChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__247990129_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWindowSizeChangedEventArgs):
        Array<IWindowSizeChangedEventArgs?> = (elements as
        Array<IWindowSizeChangedEventArgs?>).castToImpl<IWindowSizeChangedEventArgs,IWindowSizeChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWindowSizeChangedEventArgs?> =
        arrayOfNulls<IWindowSizeChangedEventArgs_Impl>(size) as Array<IWindowSizeChangedEventArgs?>
  }
}
