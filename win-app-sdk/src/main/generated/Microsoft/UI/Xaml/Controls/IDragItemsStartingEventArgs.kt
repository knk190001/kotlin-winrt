package Microsoft.UI.Xaml.Controls

import Windows.ApplicationModel.DataTransfer.DataPackage
import Windows.Foundation.Collections.IVector
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDragItemsStartingEventArgs.ABI::class)
@Signature("{a6938886-20df-558e-ac74-bb5b7f2f7e90}")
@Guid("a693888620df558eac74bb5b7f2f7e90")
@WinRTInterface("a693888620df558eac74bb5b7f2f7e90")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDragItemsStartingEventArgs.ByReference::class)
public interface IDragItemsStartingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Cancel(): Boolean

  @InterfaceMethod(1)
  public fun put_Cancel(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_Items(): IVector<IUnknown?>?

  @InterfaceMethod(3)
  public fun get_Data(): DataPackage?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDragItemsStartingEventArgs> {
    public override fun getValue() = ABI.makeIDragItemsStartingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDragItemsStartingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDragItemsStartingEventArgs {
    public val __1414529102_Ptr: Pointer?

    public val _1414529102_VtblPtr: Pointer?
      get() = __1414529102_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Cancel(): Boolean {
      val fnPtr = _1414529102_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1414529102_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Cancel(value: Boolean): Unit {
      val fnPtr = _1414529102_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1414529102_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Items(): IVector<IUnknown?>? {
      val fnPtr = _1414529102_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__1414529102_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<IUnknown?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Data(): DataPackage? {
      val fnPtr = _1414529102_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackage>()
      val hr = fn.invokeHR(arrayOf(__1414529102_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackage>(result.getValue())
      return resultValue
    }
  }

  public class IDragItemsStartingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1414529102_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDragItemsStartingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a693888620df558eac74bb5b7f2f7e90")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDragItemsStartingEventArgs(ptr: Pointer?): WithDefault =
        IDragItemsStartingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDragItemsStartingEventArgs {
      val address = segment.toRawLongValue()
      return makeIDragItemsStartingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDragItemsStartingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1414529102_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDragItemsStartingEventArgs):
        Array<IDragItemsStartingEventArgs?> = (elements as
        Array<IDragItemsStartingEventArgs?>).castToImpl<IDragItemsStartingEventArgs,IDragItemsStartingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDragItemsStartingEventArgs?> =
        arrayOfNulls<IDragItemsStartingEventArgs_Impl>(size) as Array<IDragItemsStartingEventArgs?>
  }
}
