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
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBackgroundTaskBuilder.ABI::class)
@Signature("{0351550e-3e64-4572-a93a-84075a37c917}")
@Guid("0351550e3e644572a93a84075a37c917")
@WinRTInterface("0351550e3e644572a93a84075a37c917")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundTaskBuilder.ByReference::class)
public interface IBackgroundTaskBuilder : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_TaskEntryPoint(value: String?): Unit

  @InterfaceMethod(1)
  public fun get_TaskEntryPoint(): String?

  @InterfaceMethod(2)
  public fun SetTrigger(trigger: IBackgroundTrigger?): Unit

  @InterfaceMethod(3)
  public fun AddCondition(condition: IBackgroundCondition?): Unit

  @InterfaceMethod(4)
  public fun put_Name(value: String?): Unit

  @InterfaceMethod(5)
  public fun get_Name(): String?

  @InterfaceMethod(6)
  public fun Register(): BackgroundTaskRegistration?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundTaskBuilder> {
    public override fun getValue() = ABI.makeIBackgroundTaskBuilder(pointer.getPointer(0))

    public fun setValue(value: IBackgroundTaskBuilder_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundTaskBuilder {
    public val __1536227063_Ptr: Pointer?

    public val _1536227063_VtblPtr: Pointer?
      get() = __1536227063_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_TaskEntryPoint(value: String?): Unit {
      val fnPtr = _1536227063_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1536227063_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_TaskEntryPoint(): String? {
      val fnPtr = _1536227063_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1536227063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetTrigger(trigger: IBackgroundTrigger?): Unit {
      val fnPtr = _1536227063_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1536227063_Ptr, marshalToNative(trigger),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun AddCondition(condition: IBackgroundCondition?): Unit {
      val fnPtr = _1536227063_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1536227063_Ptr, marshalToNative(condition),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun put_Name(value: String?): Unit {
      val fnPtr = _1536227063_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1536227063_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_Name(): String? {
      val fnPtr = _1536227063_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1536227063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun Register(): BackgroundTaskRegistration? {
      val fnPtr = _1536227063_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundTaskRegistration>()
      val hr = fn.invokeHR(arrayOf(__1536227063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundTaskRegistration>(result.getValue())
      return resultValue
    }
  }

  public class IBackgroundTaskBuilder_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1536227063_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundTaskBuilder, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0351550e3e644572a93a84075a37c917")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundTaskBuilder(ptr: Pointer?): WithDefault =
        IBackgroundTaskBuilder_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundTaskBuilder {
      val address = segment.toRawLongValue()
      return makeIBackgroundTaskBuilder(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundTaskBuilder): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1536227063_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundTaskBuilder): Array<IBackgroundTaskBuilder?> =
        (elements as
        Array<IBackgroundTaskBuilder?>).castToImpl<IBackgroundTaskBuilder,IBackgroundTaskBuilder_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundTaskBuilder?> =
        arrayOfNulls<IBackgroundTaskBuilder_Impl>(size) as Array<IBackgroundTaskBuilder?>
  }
}
