package Windows.Graphics.Display

import Windows.Graphics.Display.IDisplayInformation.ABI.IID
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDisplayInformation2.ABI::class)
@Signature("{4dcd0021-fad1-4b8e-8edf-775887b8bf19}")
@Guid("4dcd0021fad14b8e8edf775887b8bf19")
@WinRTInterface("4dcd0021fad14b8e8edf775887b8bf19")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayInformation2.ByReference::class)
public interface IDisplayInformation2 : NativeMapped, IWinRTInterface, IDisplayInformation {
  @InterfaceMethod(0)
  public fun get_RawPixelsPerViewPixel(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayInformation2> {
    public override fun getValue() = ABI.makeIDisplayInformation2(pointer.getPointer(0))

    public fun setValue(value: IDisplayInformation2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayInformation2, IDisplayInformation.WithDefault {
    public val __1563419927_Ptr: Pointer?

    public val _1563419927_VtblPtr: Pointer?
      get() = __1563419927_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RawPixelsPerViewPixel(): Double {
      val fnPtr = _1563419927_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1563419927_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IDisplayInformation2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IDisplayInformation {
    public override val __604622231_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1563419927_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1563419927_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayInformation2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4dcd0021fad14b8e8edf775887b8bf19")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayInformation2(ptr: Pointer?): WithDefault = IDisplayInformation2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayInformation2 {
      val address = segment.toRawLongValue()
      return makeIDisplayInformation2(Pointer(address))
    }

    public override fun toNative(obj: IDisplayInformation2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1563419927_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayInformation2): Array<IDisplayInformation2?> =
        (elements as
        Array<IDisplayInformation2?>).castToImpl<IDisplayInformation2,IDisplayInformation2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayInformation2?> =
        arrayOfNulls<IDisplayInformation2_Impl>(size) as Array<IDisplayInformation2?>
  }
}
