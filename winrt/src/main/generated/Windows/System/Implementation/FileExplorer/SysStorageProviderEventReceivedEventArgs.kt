package Windows.System.Implementation.FileExplorer

import Windows.System.Implementation.FileExplorer.ISysStorageProviderEventReceivedEventArgsFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SysStorageProviderEventReceivedEventArgs.ABI::class)
@Signature("rc(Windows.System.Implementation.FileExplorer.SysStorageProviderEventReceivedEventArgs;{e132d1b9-7b9d-5820-9728-4262b5289142})")
@WinRTByReference(brClass = SysStorageProviderEventReceivedEventArgs.ByReference::class)
public class SysStorageProviderEventReceivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISysStorageProviderEventReceivedEventArgs.WithDefault, IWinRTObject {
  private val __79572993_Interface: ISysStorageProviderEventReceivedEventArgs.WithDefault by lazy {
    as_79572993()
  }


  public override val __79572993_Ptr: JNAPointer? by lazy {
    __79572993_Interface.__79572993_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__79572993_Interface)

  public constructor(json: String) : this(ABI.activate(json))

  private fun as_79572993(): ISysStorageProviderEventReceivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISysStorageProviderEventReceivedEventArgs.ABI.makeISysStorageProviderEventReceivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISysStorageProviderEventReceivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISysStorageProviderEventReceivedEventArgs.ABI.makeISysStorageProviderEventReceivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SysStorageProviderEventReceivedEventArgs> {
    public override fun getValue() = SysStorageProviderEventReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SysStorageProviderEventReceivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SysStorageProviderEventReceivedEventArgs, MemoryAddress> {
    public val ISysStorageProviderEventReceivedEventArgsFactory_Instance:
        ISysStorageProviderEventReceivedEventArgsFactory by lazy {
      createISysStorageProviderEventReceivedEventArgsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISysStorageProviderEventReceivedEventArgsFactory():
        ISysStorageProviderEventReceivedEventArgsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Implementation.FileExplorer.SysStorageProviderEventReceivedEventArgs".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISysStorageProviderEventReceivedEventArgsFactory.ABI.makeISysStorageProviderEventReceivedEventArgsFactory(factoryActivatorPtr.value))
    }

    public fun activate(json: String): JNAPointer? =
        ISysStorageProviderEventReceivedEventArgsFactory_Instance.CreateInstance(json)?.pointer

    public override fun fromNative(segment: MemoryAddress):
        SysStorageProviderEventReceivedEventArgs {
      val address = segment.toRawLongValue()
      return SysStorageProviderEventReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SysStorageProviderEventReceivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
