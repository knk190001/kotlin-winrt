package Windows.Graphics.Printing

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IPrintManagerStatic.ABI::class)
@Signature("{58185dcd-e634-4654-84f0-e0152a8217ac}")
@Guid("58185dcde634465484f0e0152a8217ac")
@WinRTInterface("58185dcde634465484f0e0152a8217ac")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintManagerStatic.ByReference::class)
public interface IPrintManagerStatic : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentView(): PrintManager?

  @InterfaceMethod(1)
  public fun ShowPrintUIAsync(): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintManagerStatic> {
    public override fun getValue() = ABI.makeIPrintManagerStatic(pointer.getPointer(0))

    public fun setValue(value: IPrintManagerStatic_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintManagerStatic {
    public val __734838410_Ptr: Pointer?

    public val _734838410_VtblPtr: Pointer?
      get() = __734838410_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentView(): PrintManager? {
      val fnPtr = _734838410_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintManager>()
      val hr = fn.invokeHR(arrayOf(__734838410_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ShowPrintUIAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _734838410_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__734838410_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IPrintManagerStatic_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __734838410_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintManagerStatic, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("58185dcde634465484f0e0152a8217ac")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintManagerStatic(ptr: Pointer?): WithDefault = IPrintManagerStatic_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintManagerStatic {
      val address = segment.toRawLongValue()
      return makeIPrintManagerStatic(Pointer(address))
    }

    public override fun toNative(obj: IPrintManagerStatic): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__734838410_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintManagerStatic): Array<IPrintManagerStatic?> =
        (elements as
        Array<IPrintManagerStatic?>).castToImpl<IPrintManagerStatic,IPrintManagerStatic_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintManagerStatic?> =
        arrayOfNulls<IPrintManagerStatic_Impl>(size) as Array<IPrintManagerStatic?>
  }
}
