package Microsoft.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(DynamicOverflowItemsChangingEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.DynamicOverflowItemsChangingEventArgs;{bf64c37f-6332-541d-80f1-876c5bb9b196})")
@WinRTByReference(brClass = DynamicOverflowItemsChangingEventArgs.ByReference::class)
public class DynamicOverflowItemsChangingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDynamicOverflowItemsChangingEventArgs.WithDefault, IWinRTObject {
  private val __462965284_Interface: IDynamicOverflowItemsChangingEventArgs.WithDefault by lazy {
    as_462965284()
  }


  public override val __462965284_Ptr: JNAPointer? by lazy {
    __462965284_Interface.__462965284_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__462965284_Interface)

  public constructor() : this(ABI.activate())

  private fun as_462965284(): IDynamicOverflowItemsChangingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDynamicOverflowItemsChangingEventArgs.ABI.makeIDynamicOverflowItemsChangingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDynamicOverflowItemsChangingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDynamicOverflowItemsChangingEventArgs.ABI.makeIDynamicOverflowItemsChangingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DynamicOverflowItemsChangingEventArgs> {
    public override fun getValue() = DynamicOverflowItemsChangingEventArgs(pointer.getPointer(0))

    public fun setValue(value: DynamicOverflowItemsChangingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DynamicOverflowItemsChangingEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.DynamicOverflowItemsChangingEventArgs".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): DynamicOverflowItemsChangingEventArgs {
      val address = segment.toRawLongValue()
      return DynamicOverflowItemsChangingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DynamicOverflowItemsChangingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
