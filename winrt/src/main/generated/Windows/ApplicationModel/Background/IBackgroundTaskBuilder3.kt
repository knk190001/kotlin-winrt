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

@ABIMarker(IBackgroundTaskBuilder3.ABI::class)
@Signature("{28c74f4a-8ba9-4c09-a24f-19683e2c924c}")
@Guid("28c74f4a8ba94c09a24f19683e2c924c")
@WinRTInterface("28c74f4a8ba94c09a24f19683e2c924c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundTaskBuilder3.ByReference::class)
public interface IBackgroundTaskBuilder3 : NativeMapped, IWinRTInterface, IBackgroundTaskBuilder {
  @InterfaceMethod(0)
  public fun put_IsNetworkRequested(value: Boolean): Unit

  @InterfaceMethod(1)
  public fun get_IsNetworkRequested(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundTaskBuilder3> {
    public override fun getValue() = ABI.makeIBackgroundTaskBuilder3(pointer.getPointer(0))

    public fun setValue(value: IBackgroundTaskBuilder3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundTaskBuilder3, IBackgroundTaskBuilder.WithDefault {
    public val __378398748_Ptr: Pointer?

    public val _378398748_VtblPtr: Pointer?
      get() = __378398748_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_IsNetworkRequested(value: Boolean): Unit {
      val fnPtr = _378398748_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__378398748_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_IsNetworkRequested(): Boolean {
      val fnPtr = _378398748_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__378398748_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IBackgroundTaskBuilder3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundTaskBuilder {
    public override val __1536227063_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_378398748_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __378398748_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundTaskBuilder3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("28c74f4a8ba94c09a24f19683e2c924c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundTaskBuilder3(ptr: Pointer?): WithDefault =
        IBackgroundTaskBuilder3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundTaskBuilder3 {
      val address = segment.toRawLongValue()
      return makeIBackgroundTaskBuilder3(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundTaskBuilder3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__378398748_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundTaskBuilder3): Array<IBackgroundTaskBuilder3?>
        = (elements as
        Array<IBackgroundTaskBuilder3?>).castToImpl<IBackgroundTaskBuilder3,IBackgroundTaskBuilder3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundTaskBuilder3?> =
        arrayOfNulls<IBackgroundTaskBuilder3_Impl>(size) as Array<IBackgroundTaskBuilder3?>
  }
}
