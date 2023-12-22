package Windows.Graphics.Printing3D

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

@ABIMarker(IPrint3DTaskCompletedEventArgs.ABI::class)
@Signature("{cc1914af-2614-4f1d-accc-d6fc4fda5455}")
@Guid("cc1914af26144f1dacccd6fc4fda5455")
@WinRTInterface("cc1914af26144f1dacccd6fc4fda5455")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrint3DTaskCompletedEventArgs.ByReference::class)
public interface IPrint3DTaskCompletedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Completion(): Print3DTaskCompletion?

  @InterfaceMethod(1)
  public fun get_ExtendedStatus(): Print3DTaskDetail?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrint3DTaskCompletedEventArgs> {
    public override fun getValue() = ABI.makeIPrint3DTaskCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPrint3DTaskCompletedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrint3DTaskCompletedEventArgs {
    public val __111532196_Ptr: Pointer?

    public val _111532196_VtblPtr: Pointer?
      get() = __111532196_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Completion(): Print3DTaskCompletion? {
      val fnPtr = _111532196_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Print3DTaskCompletion>()
      val hr = fn.invokeHR(arrayOf(__111532196_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Print3DTaskCompletion>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedStatus(): Print3DTaskDetail? {
      val fnPtr = _111532196_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Print3DTaskDetail>()
      val hr = fn.invokeHR(arrayOf(__111532196_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Print3DTaskDetail>(result.getValue())
      return resultValue
    }
  }

  public class IPrint3DTaskCompletedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __111532196_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrint3DTaskCompletedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cc1914af26144f1dacccd6fc4fda5455")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrint3DTaskCompletedEventArgs(ptr: Pointer?): WithDefault =
        IPrint3DTaskCompletedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrint3DTaskCompletedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPrint3DTaskCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPrint3DTaskCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__111532196_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrint3DTaskCompletedEventArgs):
        Array<IPrint3DTaskCompletedEventArgs?> = (elements as
        Array<IPrint3DTaskCompletedEventArgs?>).castToImpl<IPrint3DTaskCompletedEventArgs,IPrint3DTaskCompletedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrint3DTaskCompletedEventArgs?> =
        arrayOfNulls<IPrint3DTaskCompletedEventArgs_Impl>(size) as
        Array<IPrint3DTaskCompletedEventArgs?>
  }
}
