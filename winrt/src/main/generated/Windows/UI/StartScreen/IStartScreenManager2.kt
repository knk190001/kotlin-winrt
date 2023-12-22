package Windows.UI.StartScreen

import Windows.Foundation.IAsyncOperation
import Windows.UI.StartScreen.IStartScreenManager.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStartScreenManager2.ABI::class)
@Signature("{08a716b6-316b-4ad9-acb8-fe9cf00bd608}")
@Guid("08a716b6316b4ad9acb8fe9cf00bd608")
@WinRTInterface("08a716b6316b4ad9acb8fe9cf00bd608")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStartScreenManager2.ByReference::class)
public interface IStartScreenManager2 : NativeMapped, IWinRTInterface, IStartScreenManager {
  @InterfaceMethod(0)
  public fun ContainsSecondaryTileAsync(tileId: String?): IAsyncOperation<Boolean>?

  @InterfaceMethod(1)
  public fun TryRemoveSecondaryTileAsync(tileId: String?): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStartScreenManager2> {
    public override fun getValue() = ABI.makeIStartScreenManager2(pointer.getPointer(0))

    public fun setValue(value: IStartScreenManager2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStartScreenManager2, IStartScreenManager.WithDefault {
    public val __961932023_Ptr: Pointer?

    public val _961932023_VtblPtr: Pointer?
      get() = __961932023_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ContainsSecondaryTileAsync(tileId: String?): IAsyncOperation<Boolean>? {
      val fnPtr = _961932023_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__961932023_Ptr, marshalToNative(tileId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryRemoveSecondaryTileAsync(tileId: String?): IAsyncOperation<Boolean>? {
      val fnPtr = _961932023_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__961932023_Ptr, marshalToNative(tileId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IStartScreenManager2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IStartScreenManager {
    public override val __169577399_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_961932023_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __961932023_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStartScreenManager2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("08a716b6316b4ad9acb8fe9cf00bd608")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStartScreenManager2(ptr: Pointer?): WithDefault = IStartScreenManager2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStartScreenManager2 {
      val address = segment.toRawLongValue()
      return makeIStartScreenManager2(Pointer(address))
    }

    public override fun toNative(obj: IStartScreenManager2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__961932023_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStartScreenManager2): Array<IStartScreenManager2?> =
        (elements as
        Array<IStartScreenManager2?>).castToImpl<IStartScreenManager2,IStartScreenManager2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStartScreenManager2?> =
        arrayOfNulls<IStartScreenManager2_Impl>(size) as Array<IStartScreenManager2?>
  }
}
