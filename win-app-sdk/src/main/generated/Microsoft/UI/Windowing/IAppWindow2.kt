package Microsoft.UI.Windowing

import Microsoft.UI.WindowId
import Windows.Graphics.SizeInt32
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

@ABIMarker(IAppWindow2.ABI::class)
@Signature("{6cd41292-794c-5cac-8961-210d012c6ebc}")
@Guid("6cd41292794c5cac8961210d012c6ebc")
@WinRTInterface("6cd41292794c5cac8961210d012c6ebc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppWindow2.ByReference::class)
public interface IAppWindow2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ClientSize(): SizeInt32?

  @InterfaceMethod(1)
  public fun MoveInZOrderAtBottom(): Unit

  @InterfaceMethod(2)
  public fun MoveInZOrderAtTop(): Unit

  @InterfaceMethod(3)
  public fun MoveInZOrderBelow(windowId: WindowId?): Unit

  @InterfaceMethod(4)
  public fun ResizeClient(size: SizeInt32?): Unit

  @InterfaceMethod(5)
  public fun ShowOnceWithRequestedStartupState(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAppWindow2> {
    public override fun getValue() = ABI.makeIAppWindow2(pointer.getPointer(0))

    public fun setValue(value: IAppWindow2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppWindow2 {
    public val __1895777550_Ptr: Pointer?

    public val _1895777550_VtblPtr: Pointer?
      get() = __1895777550_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ClientSize(): SizeInt32? {
      val fnPtr = _1895777550_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SizeInt32>()
      val hr = fn.invokeHR(arrayOf(__1895777550_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SizeInt32>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun MoveInZOrderAtBottom(): Unit {
      val fnPtr = _1895777550_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1895777550_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun MoveInZOrderAtTop(): Unit {
      val fnPtr = _1895777550_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1895777550_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun MoveInZOrderBelow(windowId: WindowId?): Unit {
      val fnPtr = _1895777550_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1895777550_Ptr, marshalToNative(windowId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun ResizeClient(size: SizeInt32?): Unit {
      val fnPtr = _1895777550_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1895777550_Ptr, marshalToNative(size),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun ShowOnceWithRequestedStartupState(): Unit {
      val fnPtr = _1895777550_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1895777550_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppWindow2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1895777550_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppWindow2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6cd41292794c5cac8961210d012c6ebc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppWindow2(ptr: Pointer?): WithDefault = IAppWindow2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppWindow2 {
      val address = segment.toRawLongValue()
      return makeIAppWindow2(Pointer(address))
    }

    public override fun toNative(obj: IAppWindow2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1895777550_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppWindow2): Array<IAppWindow2?> = (elements as
        Array<IAppWindow2?>).castToImpl<IAppWindow2,IAppWindow2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppWindow2?> =
        arrayOfNulls<IAppWindow2_Impl>(size) as Array<IAppWindow2?>
  }
}
