package Microsoft.Windows.Widgets.Providers

import Microsoft.Windows.Widgets.WidgetSize
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWidgetContext.ABI::class)
@Signature("{903c518b-40bc-5bc6-88f7-af9d81c0cdc1}")
@Guid("903c518b40bc5bc688f7af9d81c0cdc1")
@WinRTInterface("903c518b40bc5bc688f7af9d81c0cdc1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWidgetContext.ByReference::class)
public interface IWidgetContext : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_DefinitionId(): String?

  @InterfaceMethod(2)
  public fun get_Size(): WidgetSize?

  @InterfaceMethod(3)
  public fun get_IsActive(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IWidgetContext>
      {
    public override fun getValue() = ABI.makeIWidgetContext(pointer.getPointer(0))

    public fun setValue(value: IWidgetContext_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWidgetContext {
    public val __512988422_Ptr: Pointer?

    public val _512988422_VtblPtr: Pointer?
      get() = __512988422_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _512988422_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__512988422_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DefinitionId(): String? {
      val fnPtr = _512988422_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__512988422_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Size(): WidgetSize? {
      val fnPtr = _512988422_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WidgetSize>()
      val hr = fn.invokeHR(arrayOf(__512988422_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WidgetSize>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_IsActive(): Boolean {
      val fnPtr = _512988422_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__512988422_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IWidgetContext_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __512988422_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWidgetContext, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("903c518b40bc5bc688f7af9d81c0cdc1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWidgetContext(ptr: Pointer?): WithDefault = IWidgetContext_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWidgetContext {
      val address = segment.toRawLongValue()
      return makeIWidgetContext(Pointer(address))
    }

    public override fun toNative(obj: IWidgetContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__512988422_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWidgetContext): Array<IWidgetContext?> = (elements as
        Array<IWidgetContext?>).castToImpl<IWidgetContext,IWidgetContext_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWidgetContext?> =
        arrayOfNulls<IWidgetContext_Impl>(size) as Array<IWidgetContext?>
  }
}
