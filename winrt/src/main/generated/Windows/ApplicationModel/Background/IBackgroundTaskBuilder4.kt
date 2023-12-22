package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.IBackgroundTaskBuilder.ABI.IID
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBackgroundTaskBuilder4.ABI::class)
@Signature("{4755e522-cba2-4e35-bd16-a6da7f1c19aa}")
@Guid("4755e522cba24e35bd16a6da7f1c19aa")
@WinRTInterface("4755e522cba24e35bd16a6da7f1c19aa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundTaskBuilder4.ByReference::class)
public interface IBackgroundTaskBuilder4 : NativeMapped, IWinRTInterface, IBackgroundTaskBuilder {
  @InterfaceMethod(0)
  public fun get_TaskGroup(): BackgroundTaskRegistrationGroup?

  @InterfaceMethod(1)
  public fun put_TaskGroup(value: BackgroundTaskRegistrationGroup?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundTaskBuilder4> {
    public override fun getValue() = ABI.makeIBackgroundTaskBuilder4(pointer.getPointer(0))

    public fun setValue(value: IBackgroundTaskBuilder4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundTaskBuilder4, IBackgroundTaskBuilder.WithDefault {
    public val __378398749_Ptr: Pointer?

    public val _378398749_VtblPtr: Pointer?
      get() = __378398749_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TaskGroup(): BackgroundTaskRegistrationGroup? {
      val fnPtr = _378398749_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundTaskRegistrationGroup>()
      val hr = fn.invokeHR(arrayOf(__378398749_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundTaskRegistrationGroup>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_TaskGroup(value: BackgroundTaskRegistrationGroup?): Unit {
      val fnPtr = _378398749_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__378398749_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBackgroundTaskBuilder4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundTaskBuilder {
    public override val __1536227063_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_378398749_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __378398749_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundTaskBuilder4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4755e522cba24e35bd16a6da7f1c19aa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundTaskBuilder4(ptr: Pointer?): WithDefault =
        IBackgroundTaskBuilder4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundTaskBuilder4 {
      val address = segment.toRawLongValue()
      return makeIBackgroundTaskBuilder4(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundTaskBuilder4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__378398749_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundTaskBuilder4): Array<IBackgroundTaskBuilder4?>
        = (elements as
        Array<IBackgroundTaskBuilder4?>).castToImpl<IBackgroundTaskBuilder4,IBackgroundTaskBuilder4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundTaskBuilder4?> =
        arrayOfNulls<IBackgroundTaskBuilder4_Impl>(size) as Array<IBackgroundTaskBuilder4?>
  }
}
