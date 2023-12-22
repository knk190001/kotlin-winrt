package Windows.ApplicationModel.Core

import Windows.ApplicationModel.AppDisplayInfo
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

@ABIMarker(IAppListEntry.ABI::class)
@Signature("{ef00f07f-2108-490a-877a-8a9f17c25fad}")
@Guid("ef00f07f2108490a877a8a9f17c25fad")
@WinRTInterface("ef00f07f2108490a877a8a9f17c25fad")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppListEntry.ByReference::class)
public interface IAppListEntry : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DisplayInfo(): AppDisplayInfo?

  @InterfaceMethod(1)
  public fun LaunchAsync(): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAppListEntry>
      {
    public override fun getValue() = ABI.makeIAppListEntry(pointer.getPointer(0))

    public fun setValue(value: IAppListEntry_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppListEntry {
    public val __971149171_Ptr: Pointer?

    public val _971149171_VtblPtr: Pointer?
      get() = __971149171_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisplayInfo(): AppDisplayInfo? {
      val fnPtr = _971149171_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppDisplayInfo>()
      val hr = fn.invokeHR(arrayOf(__971149171_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppDisplayInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun LaunchAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _971149171_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__971149171_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IAppListEntry_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __971149171_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppListEntry, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ef00f07f2108490a877a8a9f17c25fad")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppListEntry(ptr: Pointer?): WithDefault = IAppListEntry_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppListEntry {
      val address = segment.toRawLongValue()
      return makeIAppListEntry(Pointer(address))
    }

    public override fun toNative(obj: IAppListEntry): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__971149171_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppListEntry): Array<IAppListEntry?> = (elements as
        Array<IAppListEntry?>).castToImpl<IAppListEntry,IAppListEntry_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppListEntry?> =
        arrayOfNulls<IAppListEntry_Impl>(size) as Array<IAppListEntry?>
  }
}
