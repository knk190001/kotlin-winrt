package Windows.ApplicationModel.Core

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreApplicationUseCount.ABI::class)
@Signature("{518dc408-c077-475b-809e-0bc0c57e4b74}")
@Guid("518dc408c077475b809e0bc0c57e4b74")
@WinRTInterface("518dc408c077475b809e0bc0c57e4b74")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreApplicationUseCount.ByReference::class)
public interface ICoreApplicationUseCount : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IncrementApplicationUseCount(): Unit

  @InterfaceMethod(1)
  public fun DecrementApplicationUseCount(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreApplicationUseCount> {
    public override fun getValue() = ABI.makeICoreApplicationUseCount(pointer.getPointer(0))

    public fun setValue(value: ICoreApplicationUseCount_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreApplicationUseCount {
    public val __728850681_Ptr: Pointer?

    public val _728850681_VtblPtr: Pointer?
      get() = __728850681_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IncrementApplicationUseCount(): Unit {
      val fnPtr = _728850681_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__728850681_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun DecrementApplicationUseCount(): Unit {
      val fnPtr = _728850681_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__728850681_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreApplicationUseCount_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __728850681_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreApplicationUseCount, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("518dc408c077475b809e0bc0c57e4b74")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreApplicationUseCount(ptr: Pointer?): WithDefault =
        ICoreApplicationUseCount_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreApplicationUseCount {
      val address = segment.toRawLongValue()
      return makeICoreApplicationUseCount(Pointer(address))
    }

    public override fun toNative(obj: ICoreApplicationUseCount): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__728850681_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreApplicationUseCount):
        Array<ICoreApplicationUseCount?> = (elements as
        Array<ICoreApplicationUseCount?>).castToImpl<ICoreApplicationUseCount,ICoreApplicationUseCount_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreApplicationUseCount?> =
        arrayOfNulls<ICoreApplicationUseCount_Impl>(size) as Array<ICoreApplicationUseCount?>
  }
}
