package Microsoft.UI.Input

import Windows.Foundation.Point
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

@ABIMarker(IDraggingEventArgs.ABI::class)
@Signature("{3efb1b75-3d3b-550e-963d-0828ca76128a}")
@Guid("3efb1b753d3b550e963d0828ca76128a")
@WinRTInterface("3efb1b753d3b550e963d0828ca76128a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDraggingEventArgs.ByReference::class)
public interface IDraggingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DraggingState(): DraggingState?

  @InterfaceMethod(1)
  public fun get_PointerDeviceType(): PointerDeviceType?

  @InterfaceMethod(2)
  public fun get_Position(): Point?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDraggingEventArgs> {
    public override fun getValue() = ABI.makeIDraggingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDraggingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDraggingEventArgs {
    public val __1147260335_Ptr: Pointer?

    public val _1147260335_VtblPtr: Pointer?
      get() = __1147260335_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DraggingState(): DraggingState? {
      val fnPtr = _1147260335_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DraggingState>()
      val hr = fn.invokeHR(arrayOf(__1147260335_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DraggingState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PointerDeviceType(): PointerDeviceType? {
      val fnPtr = _1147260335_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointerDeviceType>()
      val hr = fn.invokeHR(arrayOf(__1147260335_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointerDeviceType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Position(): Point? {
      val fnPtr = _1147260335_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1147260335_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }
  }

  public class IDraggingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1147260335_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDraggingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3efb1b753d3b550e963d0828ca76128a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDraggingEventArgs(ptr: Pointer?): WithDefault = IDraggingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDraggingEventArgs {
      val address = segment.toRawLongValue()
      return makeIDraggingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDraggingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1147260335_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDraggingEventArgs): Array<IDraggingEventArgs?> =
        (elements as
        Array<IDraggingEventArgs?>).castToImpl<IDraggingEventArgs,IDraggingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDraggingEventArgs?> =
        arrayOfNulls<IDraggingEventArgs_Impl>(size) as Array<IDraggingEventArgs?>
  }
}
