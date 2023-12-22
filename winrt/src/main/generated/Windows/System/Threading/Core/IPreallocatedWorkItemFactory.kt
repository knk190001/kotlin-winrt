package Windows.System.Threading.Core

import Windows.System.Threading.WorkItemHandler
import Windows.System.Threading.WorkItemOptions
import Windows.System.Threading.WorkItemPriority
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

@ABIMarker(IPreallocatedWorkItemFactory.ABI::class)
@Signature("{e3d32b45-dfea-469b-82c5-f6e3cefdeafb}")
@Guid("e3d32b45dfea469b82c5f6e3cefdeafb")
@WinRTInterface("e3d32b45dfea469b82c5f6e3cefdeafb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPreallocatedWorkItemFactory.ByReference::class)
public interface IPreallocatedWorkItemFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWorkItem(handler: WorkItemHandler?): PreallocatedWorkItem?

  @InterfaceMethod(1)
  public fun CreateWorkItemWithPriority(handler: WorkItemHandler?, priority: WorkItemPriority?):
      PreallocatedWorkItem?

  @InterfaceMethod(2)
  public fun CreateWorkItemWithPriorityAndOptions(
    handler: WorkItemHandler?,
    priority: WorkItemPriority?,
    options: WorkItemOptions?
  ): PreallocatedWorkItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPreallocatedWorkItemFactory> {
    public override fun getValue() = ABI.makeIPreallocatedWorkItemFactory(pointer.getPointer(0))

    public fun setValue(value: IPreallocatedWorkItemFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPreallocatedWorkItemFactory {
    public val __1216296354_Ptr: Pointer?

    public val _1216296354_VtblPtr: Pointer?
      get() = __1216296354_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWorkItem(handler: WorkItemHandler?): PreallocatedWorkItem? {
      val fnPtr = _1216296354_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PreallocatedWorkItem>()
      val hr = fn.invokeHR(arrayOf(__1216296354_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PreallocatedWorkItem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWorkItemWithPriority(handler: WorkItemHandler?,
        priority: WorkItemPriority?): PreallocatedWorkItem? {
      val fnPtr = _1216296354_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PreallocatedWorkItem>()
      val hr = fn.invokeHR(arrayOf(__1216296354_Ptr, marshalToNative(handler),
          marshalToNative(priority), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PreallocatedWorkItem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateWorkItemWithPriorityAndOptions(
      handler: WorkItemHandler?,
      priority: WorkItemPriority?,
      options: WorkItemOptions?
    ): PreallocatedWorkItem? {
      val fnPtr = _1216296354_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PreallocatedWorkItem>()
      val hr = fn.invokeHR(arrayOf(__1216296354_Ptr, marshalToNative(handler),
          marshalToNative(priority), marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PreallocatedWorkItem>(result.getValue())
      return resultValue
    }
  }

  public class IPreallocatedWorkItemFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1216296354_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPreallocatedWorkItemFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e3d32b45dfea469b82c5f6e3cefdeafb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPreallocatedWorkItemFactory(ptr: Pointer?): WithDefault =
        IPreallocatedWorkItemFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPreallocatedWorkItemFactory {
      val address = segment.toRawLongValue()
      return makeIPreallocatedWorkItemFactory(Pointer(address))
    }

    public override fun toNative(obj: IPreallocatedWorkItemFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1216296354_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPreallocatedWorkItemFactory):
        Array<IPreallocatedWorkItemFactory?> = (elements as
        Array<IPreallocatedWorkItemFactory?>).castToImpl<IPreallocatedWorkItemFactory,IPreallocatedWorkItemFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPreallocatedWorkItemFactory?> =
        arrayOfNulls<IPreallocatedWorkItemFactory_Impl>(size) as
        Array<IPreallocatedWorkItemFactory?>
  }
}
