package Windows.Devices.PointOfService

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

@ABIMarker(ICashDrawerEventSourceEventArgs.ABI::class)
@Signature("{69cb3bc1-147f-421c-9c23-090123bb786c}")
@Guid("69cb3bc1147f421c9c23090123bb786c")
@WinRTInterface("69cb3bc1147f421c9c23090123bb786c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICashDrawerEventSourceEventArgs.ByReference::class)
public interface ICashDrawerEventSourceEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CashDrawer(): CashDrawer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICashDrawerEventSourceEventArgs> {
    public override fun getValue() = ABI.makeICashDrawerEventSourceEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICashDrawerEventSourceEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICashDrawerEventSourceEventArgs {
    public val __1289101765_Ptr: Pointer?

    public val _1289101765_VtblPtr: Pointer?
      get() = __1289101765_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CashDrawer(): CashDrawer? {
      val fnPtr = _1289101765_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CashDrawer>()
      val hr = fn.invokeHR(arrayOf(__1289101765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CashDrawer>(result.getValue())
      return resultValue
    }
  }

  public class ICashDrawerEventSourceEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1289101765_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICashDrawerEventSourceEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("69cb3bc1147f421c9c23090123bb786c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICashDrawerEventSourceEventArgs(ptr: Pointer?): WithDefault =
        ICashDrawerEventSourceEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICashDrawerEventSourceEventArgs {
      val address = segment.toRawLongValue()
      return makeICashDrawerEventSourceEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICashDrawerEventSourceEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1289101765_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICashDrawerEventSourceEventArgs):
        Array<ICashDrawerEventSourceEventArgs?> = (elements as
        Array<ICashDrawerEventSourceEventArgs?>).castToImpl<ICashDrawerEventSourceEventArgs,ICashDrawerEventSourceEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICashDrawerEventSourceEventArgs?> =
        arrayOfNulls<ICashDrawerEventSourceEventArgs_Impl>(size) as
        Array<ICashDrawerEventSourceEventArgs?>
  }
}
