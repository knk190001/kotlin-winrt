package Windows.Devices.Lights.Effects

import Windows.Foundation.TimeSpan
import Windows.UI.Color
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

@ABIMarker(ILampArrayUpdateRequestedEventArgs.ABI::class)
@Signature("{73560d6a-576a-48af-8539-67ffa0ab3516}")
@Guid("73560d6a576a48af853967ffa0ab3516")
@WinRTInterface("73560d6a576a48af853967ffa0ab3516")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILampArrayUpdateRequestedEventArgs.ByReference::class)
public interface ILampArrayUpdateRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SinceStarted(): TimeSpan?

  @InterfaceMethod(1)
  public fun SetColor(desiredColor: Color?): Unit

  @InterfaceMethod(2)
  public fun SetColorForIndex(lampIndex: Int, desiredColor: Color?): Unit

  @InterfaceMethod(3)
  public fun SetSingleColorForIndices(desiredColor: Color?, lampIndexes: Array<Int>): Unit

  @InterfaceMethod(4)
  public fun SetColorsForIndices(desiredColors: Array<Color?>, lampIndexes: Array<Int>): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILampArrayUpdateRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeILampArrayUpdateRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ILampArrayUpdateRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILampArrayUpdateRequestedEventArgs {
    public val __1570509609_Ptr: Pointer?

    public val _1570509609_VtblPtr: Pointer?
      get() = __1570509609_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SinceStarted(): TimeSpan? {
      val fnPtr = _1570509609_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1570509609_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetColor(desiredColor: Color?): Unit {
      val fnPtr = _1570509609_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1570509609_Ptr, marshalToNative(desiredColor),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun SetColorForIndex(lampIndex: Int, desiredColor: Color?): Unit {
      val fnPtr = _1570509609_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1570509609_Ptr, lampIndex, marshalToNative(desiredColor),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun SetSingleColorForIndices(desiredColor: Color?, lampIndexes: Array<Int>):
        Unit {
      val fnPtr = _1570509609_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1570509609_Ptr, marshalToNative(desiredColor),
          lampIndexes.size,marshalToNative(lampIndexes),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun SetColorsForIndices(desiredColors: Array<Color?>, lampIndexes: Array<Int>):
        Unit {
      val fnPtr = _1570509609_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1570509609_Ptr,
          desiredColors.size,marshalToNative(desiredColors),
          lampIndexes.size,marshalToNative(lampIndexes),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILampArrayUpdateRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1570509609_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILampArrayUpdateRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("73560d6a576a48af853967ffa0ab3516")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILampArrayUpdateRequestedEventArgs(ptr: Pointer?): WithDefault =
        ILampArrayUpdateRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILampArrayUpdateRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeILampArrayUpdateRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ILampArrayUpdateRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1570509609_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILampArrayUpdateRequestedEventArgs):
        Array<ILampArrayUpdateRequestedEventArgs?> = (elements as
        Array<ILampArrayUpdateRequestedEventArgs?>).castToImpl<ILampArrayUpdateRequestedEventArgs,ILampArrayUpdateRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILampArrayUpdateRequestedEventArgs?> =
        arrayOfNulls<ILampArrayUpdateRequestedEventArgs_Impl>(size) as
        Array<ILampArrayUpdateRequestedEventArgs?>
  }
}
