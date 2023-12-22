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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBackgroundTaskBuilder2.ABI::class)
@Signature("{6ae7cfb1-104f-406d-8db6-844a570f42bb}")
@Guid("6ae7cfb1104f406d8db6844a570f42bb")
@WinRTInterface("6ae7cfb1104f406d8db6844a570f42bb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundTaskBuilder2.ByReference::class)
public interface IBackgroundTaskBuilder2 : NativeMapped, IWinRTInterface, IBackgroundTaskBuilder {
  @InterfaceMethod(0)
  public fun put_CancelOnConditionLoss(value: Boolean): Unit

  @InterfaceMethod(1)
  public fun get_CancelOnConditionLoss(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundTaskBuilder2> {
    public override fun getValue() = ABI.makeIBackgroundTaskBuilder2(pointer.getPointer(0))

    public fun setValue(value: IBackgroundTaskBuilder2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundTaskBuilder2, IBackgroundTaskBuilder.WithDefault {
    public val __378398747_Ptr: Pointer?

    public val _378398747_VtblPtr: Pointer?
      get() = __378398747_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_CancelOnConditionLoss(value: Boolean): Unit {
      val fnPtr = _378398747_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__378398747_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_CancelOnConditionLoss(): Boolean {
      val fnPtr = _378398747_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__378398747_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IBackgroundTaskBuilder2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundTaskBuilder {
    public override val __1536227063_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_378398747_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __378398747_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundTaskBuilder2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6ae7cfb1104f406d8db6844a570f42bb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundTaskBuilder2(ptr: Pointer?): WithDefault =
        IBackgroundTaskBuilder2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundTaskBuilder2 {
      val address = segment.toRawLongValue()
      return makeIBackgroundTaskBuilder2(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundTaskBuilder2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__378398747_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundTaskBuilder2): Array<IBackgroundTaskBuilder2?>
        = (elements as
        Array<IBackgroundTaskBuilder2?>).castToImpl<IBackgroundTaskBuilder2,IBackgroundTaskBuilder2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundTaskBuilder2?> =
        arrayOfNulls<IBackgroundTaskBuilder2_Impl>(size) as Array<IBackgroundTaskBuilder2?>
  }
}
