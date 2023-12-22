package Windows.ApplicationModel.Background

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ITimeTriggerFactory.ABI::class)
@Signature("{38c682fe-9b54-45e6-b2f3-269b87a6f734}")
@Guid("38c682fe9b5445e6b2f3269b87a6f734")
@WinRTInterface("38c682fe9b5445e6b2f3269b87a6f734")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimeTriggerFactory.ByReference::class)
public interface ITimeTriggerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(freshnessTime: WinDef.UINT, oneShot: Boolean): TimeTrigger?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimeTriggerFactory> {
    public override fun getValue() = ABI.makeITimeTriggerFactory(pointer.getPointer(0))

    public fun setValue(value: ITimeTriggerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimeTriggerFactory {
    public val __2131448848_Ptr: Pointer?

    public val _2131448848_VtblPtr: Pointer?
      get() = __2131448848_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(freshnessTime: WinDef.UINT, oneShot: Boolean): TimeTrigger? {
      val fnPtr = _2131448848_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeTrigger>()
      val hr = fn.invokeHR(arrayOf(__2131448848_Ptr, freshnessTime, oneShot, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeTrigger>(result.getValue())
      return resultValue
    }
  }

  public class ITimeTriggerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2131448848_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimeTriggerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("38c682fe9b5445e6b2f3269b87a6f734")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimeTriggerFactory(ptr: Pointer?): WithDefault = ITimeTriggerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimeTriggerFactory {
      val address = segment.toRawLongValue()
      return makeITimeTriggerFactory(Pointer(address))
    }

    public override fun toNative(obj: ITimeTriggerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2131448848_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimeTriggerFactory): Array<ITimeTriggerFactory?> =
        (elements as
        Array<ITimeTriggerFactory?>).castToImpl<ITimeTriggerFactory,ITimeTriggerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimeTriggerFactory?> =
        arrayOfNulls<ITimeTriggerFactory_Impl>(size) as Array<ITimeTriggerFactory?>
  }
}
