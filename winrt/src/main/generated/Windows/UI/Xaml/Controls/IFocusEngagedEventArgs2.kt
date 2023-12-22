package Windows.UI.Xaml.Controls

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFocusEngagedEventArgs2.ABI::class)
@Signature("{4a59e0f4-87c0-4ccd-93c4-a3a01ce39265}")
@Guid("4a59e0f487c04ccd93c4a3a01ce39265")
@WinRTInterface("4a59e0f487c04ccd93c4a3a01ce39265")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFocusEngagedEventArgs2.ByReference::class)
public interface IFocusEngagedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Handled(): Boolean

  @InterfaceMethod(1)
  public fun put_Handled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFocusEngagedEventArgs2> {
    public override fun getValue() = ABI.makeIFocusEngagedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IFocusEngagedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFocusEngagedEventArgs2 {
    public val __1054305058_Ptr: Pointer?

    public val _1054305058_VtblPtr: Pointer?
      get() = __1054305058_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1054305058_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1054305058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1054305058_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1054305058_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFocusEngagedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1054305058_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFocusEngagedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4a59e0f487c04ccd93c4a3a01ce39265")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFocusEngagedEventArgs2(ptr: Pointer?): WithDefault =
        IFocusEngagedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFocusEngagedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIFocusEngagedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IFocusEngagedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1054305058_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFocusEngagedEventArgs2): Array<IFocusEngagedEventArgs2?>
        = (elements as
        Array<IFocusEngagedEventArgs2?>).castToImpl<IFocusEngagedEventArgs2,IFocusEngagedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFocusEngagedEventArgs2?> =
        arrayOfNulls<IFocusEngagedEventArgs2_Impl>(size) as Array<IFocusEngagedEventArgs2?>
  }
}
