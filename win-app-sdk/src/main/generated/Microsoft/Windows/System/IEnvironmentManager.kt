package Microsoft.Windows.System

import Windows.Foundation.Collections.IMapView
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

@ABIMarker(IEnvironmentManager.ABI::class)
@Signature("{d1b239bb-7013-5176-b02a-63477410d986}")
@Guid("d1b239bb70135176b02a63477410d986")
@WinRTInterface("d1b239bb70135176b02a63477410d986")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEnvironmentManager.ByReference::class)
public interface IEnvironmentManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetEnvironmentVariables(): IMapView<String?, String?>?

  @InterfaceMethod(1)
  public fun GetEnvironmentVariable(name: String?): String?

  @InterfaceMethod(2)
  public fun SetEnvironmentVariable(name: String?, value: String?): Unit

  @InterfaceMethod(3)
  public fun AppendToPath(path: String?): Unit

  @InterfaceMethod(4)
  public fun RemoveFromPath(path: String?): Unit

  @InterfaceMethod(5)
  public fun AddExecutableFileExtension(pathExt: String?): Unit

  @InterfaceMethod(6)
  public fun RemoveExecutableFileExtension(pathExt: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEnvironmentManager> {
    public override fun getValue() = ABI.makeIEnvironmentManager(pointer.getPointer(0))

    public fun setValue(value: IEnvironmentManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEnvironmentManager {
    public val __1374343511_Ptr: Pointer?

    public val _1374343511_VtblPtr: Pointer?
      get() = __1374343511_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetEnvironmentVariables(): IMapView<String?, String?>? {
      val fnPtr = _1374343511_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, String?>>()
      val hr = fn.invokeHR(arrayOf(__1374343511_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetEnvironmentVariable(name: String?): String? {
      val fnPtr = _1374343511_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1374343511_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetEnvironmentVariable(name: String?, value: String?): Unit {
      val fnPtr = _1374343511_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1374343511_Ptr, marshalToNative(name),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun AppendToPath(path: String?): Unit {
      val fnPtr = _1374343511_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1374343511_Ptr, marshalToNative(path),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun RemoveFromPath(path: String?): Unit {
      val fnPtr = _1374343511_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1374343511_Ptr, marshalToNative(path),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun AddExecutableFileExtension(pathExt: String?): Unit {
      val fnPtr = _1374343511_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1374343511_Ptr, marshalToNative(pathExt),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun RemoveExecutableFileExtension(pathExt: String?): Unit {
      val fnPtr = _1374343511_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1374343511_Ptr, marshalToNative(pathExt),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IEnvironmentManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1374343511_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEnvironmentManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d1b239bb70135176b02a63477410d986")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEnvironmentManager(ptr: Pointer?): WithDefault = IEnvironmentManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEnvironmentManager {
      val address = segment.toRawLongValue()
      return makeIEnvironmentManager(Pointer(address))
    }

    public override fun toNative(obj: IEnvironmentManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1374343511_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEnvironmentManager): Array<IEnvironmentManager?> =
        (elements as
        Array<IEnvironmentManager?>).castToImpl<IEnvironmentManager,IEnvironmentManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEnvironmentManager?> =
        arrayOfNulls<IEnvironmentManager_Impl>(size) as Array<IEnvironmentManager?>
  }
}
